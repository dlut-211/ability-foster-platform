package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeAbilityDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.Knowledge;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.repository.AbilityRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.CourseRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.KnowledgeRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.KnowledgeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/23 21:12
 * @Description:  所有添加、修改操作中均未添加创建人、创建时间、修改人、修改时间
 **/

@Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private KnowledgeRepository knowledgeRepository;

    @Autowired
    private AbilityRepository abilityRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SystemOptionRepository systemOptionRepository;

    /**
     * 查询课程下的知识点列表 - 不分页
     * @param courseId
     * @return
     */
    @Transactional
    @Override
    public List<KnowledgeDTO> findKnowledgeDTOList(Integer courseId) {
        List<Knowledge> knowledgeList = knowledgeRepository.findAllByCourseId(courseId);
        return knowledgeList2KnowledgeList(knowledgeList);
    }


    /**
     * 查询课程下的知识点列表 - 分页
     * @param courseId
     * @param pageable
     * @return
     */
    @Transactional
    @Override
    public Page<KnowledgeDTO> findKnowledgeDTOByPage(Integer courseId, Pageable pageable) {
        Page<Knowledge> knowledgePage = knowledgeRepository.findAllByCourseId(courseId, pageable);
        List<KnowledgeDTO> knowledgeDTOList = knowledgeList2KnowledgeList(knowledgePage.getContent());
        Page<KnowledgeDTO> knowledgeDTOPage = new PageImpl<>(knowledgeDTOList, pageable, knowledgePage.getTotalElements());
        return knowledgeDTOPage;
    }

    /**
     * 将 knowledgeList转化为knowledgeDTOList
     * @param content
     * @return
     */
    private List<KnowledgeDTO> knowledgeList2KnowledgeList(List<Knowledge> content) {
        List<KnowledgeDTO> knowledgeDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(content)) {
            for (Knowledge knowledge : content) {
                // 1 拷贝 KnowledgeDTO 与 Knowledge 的共有属性
                KnowledgeDTO knowledgeDTO = new KnowledgeDTO();
                BeanUtils.copyProperties(knowledge, knowledgeDTO);
                knowledgeDTO.setSelectId(knowledge.getId());
                // 2 返回各外键所关联的对象
                if (ObjectUtils.isEmpty(knowledge.getAbilityId())) {
                    throw new PlatformException(ResultEnum.ABILITY_ID_IS_NULL);
                }
                if ( ObjectUtils.isEmpty(knowledge.getCourseId())) {
                    throw new PlatformException(ResultEnum.COURSE_ID_IS_NULL);
                }
                Ability ability = abilityRepository.findById(knowledge.getAbilityId()).orElse(null);
                if (ObjectUtils.isEmpty(ability)) {
                    throw new PlatformException(ResultEnum.ABILITY_NOT_FOUND);
                }
                knowledgeDTO.setAbility(ability);
                Course course = courseRepository.findById(knowledge.getCourseId()).orElse(null);
                if (ObjectUtils.isEmpty(course)) {
                    throw new PlatformException(ResultEnum.COURSE_NOT_FOUND);
                }
                knowledgeDTO.setCourse(course);
                if (ObjectUtils.isEmpty(course.getSubjectId())) {
                    throw new PlatformException(ResultEnum.SUBJECT_ID_IS_NULL);
                }
                /** 因为历史遗留问题 有人将学科Subject在数据库中设置为了SystemOption **/
                SystemOption subject = systemOptionRepository.findById(course.getSubjectId()).orElse(null);
                if (ObjectUtils.isEmpty(subject)) {
                    throw new PlatformException(ResultEnum.SYSTEM_OPTION_NOT_FOUND);
                }
                knowledgeDTO.setSystemOption(subject);
                knowledgeDTO.setAbilityName(ability.getName());
                knowledgeDTOList.add(knowledgeDTO);
            }
        }
        return knowledgeDTOList;
    }

    /**
     * 按 id 删除 知识点
     * @param id
     */
    @Transactional
    @Override
    public void remove(Integer id) {
        Knowledge knowledge = knowledgeRepository.findById(id).orElse(null);
        if (knowledge == null) {
            throw new PlatformException(ResultEnum.KNOWLEDGE_NOT_FOUND);
        }
        knowledgeRepository.deleteById(id);
    }

    /**
     * 编辑知识点信息
     * 虽然前端传入了AbilityId与AbilityName 但是在此的作用应该是只修改Knowledge的abilityId
     * 因为abilityId作为外键 且是从前端 Select 下拉框中所直接选择的内容 所以不存在需要判断是否存在的情况
     * @param knowledgeAbilityDTO
     * @return
     */
    @Transactional
    @Override
    public Knowledge edit(KnowledgeAbilityDTO knowledgeAbilityDTO) {
        Knowledge knowledge = knowledgeRepository.findById(knowledgeAbilityDTO.getId()).orElse(null);
        if (ObjectUtils.isEmpty(knowledge)) {
            throw new PlatformException(ResultEnum.KNOWLEDGE_NOT_FOUND);
        }
        BeanUtils.copyProperties(knowledgeAbilityDTO, knowledge);
        Knowledge result = knowledgeRepository.save(knowledge);
        if (ObjectUtils.isEmpty(result)) {
            throw new PlatformException(ResultEnum.KNOWLEDGE_EDIT_FAIL);
        }
        return result;
    }

    /**
     * 添加知识点
     * @param knowledgeAbilityDTO
     * @return
     */
    @Transactional
    @Override
    public Knowledge add(KnowledgeAbilityDTO knowledgeAbilityDTO) {
        // 1 获取同一课程下的全部知识点列表
        List<Knowledge> knowledgeList = knowledgeRepository.findAllByCourseId(knowledgeAbilityDTO.getCourseId());
        // 1.1 验证同一门课程下的知识点是否重复
        for (Knowledge knowledge : knowledgeList) {
            if (knowledge.getName().equals(knowledgeAbilityDTO.getName())) {
                throw new PlatformException(ResultEnum.KNOWLEDGE_EXISTS);
            }
        }
        Knowledge knowledge = new Knowledge();
        BeanUtils.copyProperties(knowledgeAbilityDTO, knowledge);
        /** 需要修改 **/
        // TODO
        knowledge.setCreatedBy(1000);
        knowledge.setModifiedBy(1000);
        // 2 均不重复的话则插入知识点
        Knowledge result = knowledgeRepository.save(knowledge);
        return result;
    }

}
