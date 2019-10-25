package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterWorkDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.WorkDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.model.Work;
import edu.dlut.ssdut.abilityfosterplatform.model.WorkKnowledge;
import edu.dlut.ssdut.abilityfosterplatform.repository.WorkKnowledgeRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.WorkRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.ChapterWorkService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: raymond
 * @Date: 2019/10/24 19:33
 * @Description:
 **/
@Service
public class ChapterWorkServiceImpl implements ChapterWorkService {

    @Autowired
    private WorkRepository workRepository;

    @Autowired
    private WorkKnowledgeRepository workKnowledgeRepository;

    /**
     * 按id删除作业
     * 注意！删除时要删除与之关联的表中的数据
     * @param id
     */
    @Transactional
    @Override
    public void remove(Integer id) {
        if (ObjectUtils.isEmpty(id)) {
            throw new PlatformException(ResultEnum.WORK_ID_IS_NULL);
        }
        List<WorkKnowledge> workKnowledgeList = workKnowledgeRepository.findAllByWorkId(id);
        if (CollectionUtils.isEmpty(workKnowledgeList)) {
            throw new PlatformException(ResultEnum.WORK_KNOWLEDGE_IS_EMPTY);
        }
        for (WorkKnowledge workKnowledge : workKnowledgeList) {
            workKnowledgeRepository.delete(workKnowledge);
        }
        workRepository.deleteById(id);
    }

    /**
     * 编辑作业 涉及Work， WorkKnowledge
     * @param chapterWorkDTO
     * @return
     */
    @Transactional
    @Override
    public Work edit(ChapterWorkDTO chapterWorkDTO) {
        // 1 查询出要编辑的作业
        Work work = workRepository.findById(chapterWorkDTO.getId()).orElse(null);
        if (ObjectUtils.isEmpty(work)) {
            throw new PlatformException(ResultEnum.WORK_NOT_FOUND);
        }
        // 2 将要修改的除知识点以外的基本内容拷贝到 work 中
        BeanUtils.copyProperties(chapterWorkDTO, work);
        // 3 修改同一作业下的知识点 采用先删除后添加的方式 时间复杂度为O(n) 如果采用校验新添加的是否已经存在 则需循环校验，然后插入 时间复杂度为 n 方
        // 3.1 获取 chapterWorkDTO 中的知识点列表
        List<Integer> idList = chapterWorkDTO.getKnowledgeIdList();
        // 3.1.1 如果知识点列表不为空的话则进行修改
        if (!CollectionUtils.isEmpty(idList)) {
            // 3.2 删除同一作业下的所有知识点
            // 3.2.1 获取同一作业下的所有知识点
            List<WorkKnowledge> workKnowledgeList = workKnowledgeRepository.findAllByWorkId(chapterWorkDTO.getId());
            // 3.2.2 获取同一作业下的所有知识点ID
            List<Integer> workKnowledgeIdList = workKnowledgeList.stream().map(e -> e.getId()).collect(Collectors.toList());
            for (Integer id : workKnowledgeIdList) {
                workKnowledgeRepository.deleteById(id);
            }
            // 3.3 添加ChapterWorkDTO携传输过来的知识点
            for (Integer id : idList) {
                WorkKnowledge workKnowledge = new WorkKnowledge();
                workKnowledge.setKnowledgeId(id);
                workKnowledge.setWorkId(chapterWorkDTO.getId());
                workKnowledge.setCreatedBy(1000);
                workKnowledgeRepository.save(workKnowledge);
            }
        }
        Work result = workRepository.save(work);
        return result;
    }

    /**
     * 添加作业
     * @param chapterWorkDTO
     * @return
     */
    @Transactional
    @Override
    public Work add(ChapterWorkDTO chapterWorkDTO) {
        Work work = new Work();
        BeanUtils.copyProperties(chapterWorkDTO, work);
        work.setCreatedBy(1000);
        work.setModifiedBy(1000);
        // 判断同一章节下是否同在同名作业
        for (Work checkWorkName : workRepository.findAllByChapterId(chapterWorkDTO.getChapterId())) {
            if (!StringUtils.isEmpty(checkWorkName.getName()) && checkWorkName.getName().equals(chapterWorkDTO.getName())) {
                throw new PlatformException(ResultEnum.CHAPTER_WORK_EXISTS);
            }
        }
        Work result = workRepository.save(work);
        for (Integer workKnowledgeId : chapterWorkDTO.getKnowledgeIdList()) {
            WorkKnowledge workKnowledge = new WorkKnowledge();
            workKnowledge.setKnowledgeId(workKnowledgeId);
            // 获取刚插入的workId
            workKnowledge.setWorkId(result.getId());
            workKnowledge.setCreatedBy(1000);
            // TODO
            workKnowledgeRepository.save(workKnowledge);
        }
        return result;
    }

    /**
     * 获取作业列表
     * @param chapterId
     * @return
     */
    @Transactional
    @Override
    public ChapterWorkDTO list(Integer chapterId) {
        ChapterWorkDTO chapterWorkDTO = new ChapterWorkDTO();
        // 1 workDTOList
        List<WorkDTO> workDTOList = new ArrayList<>();
        // 2 knowledgeIdList
        List<Integer> knowledgeIdList = new ArrayList<>();

        List<Integer> workIdList = new ArrayList<>();
        // 3 查询同一章节下的作业
        List<Work> workList = workRepository.findAllByChapterId(chapterId);
        if (CollectionUtils.isEmpty(workList)) {
            throw new PlatformException(ResultEnum.CHAPTER_WORK_EMPTY);
        }
        // 4 如果同一章节下的作业不为空的话
        for (Work work : workList) {
            // 4.1 拼装WorkDTO对象 WorkDTO比Work多了一个knowledgeId属性
            WorkDTO workDTO = new WorkDTO();
            BeanUtils.copyProperties(work, workDTO);
            // 4.2 同一个作业包含多个知识点
            List<WorkKnowledge> workKnowledgeList = workKnowledgeRepository.findAllByWorkId(work.getId());
            knowledgeIdList = workKnowledgeList.stream().map(e -> e.getId()).collect(Collectors.toList());
            workDTO.setKnowledgeIdList(knowledgeIdList);
            workDTOList.add(workDTO);
            workIdList.add(work.getId());
        }
        chapterWorkDTO.setWorkIdList(workIdList);
        chapterWorkDTO.setWorkDTOList(workDTOList);
        return chapterWorkDTO;
    }
}
