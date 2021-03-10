package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import com.alibaba.fastjson.JSON;
import edu.dlut.ssdut.abilityfosterplatform.dto.CourseAKDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeAbilityDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TreeDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Knowledge;
import edu.dlut.ssdut.abilityfosterplatform.repository.KnowledgeRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.KnowledgeService;
import io.swagger.models.auth.In;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.awt.print.Pageable;
import java.util.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledgeServiceImplTest {

    @Autowired
    private KnowledgeService knowledgeService;
    @Resource
    KnowledgeMapper knowledgeMapper;

    @Test
    public void findKnowledgeDTOList() {
        List<KnowledgeDTO> knowledgeDTOList = knowledgeService.findKnowledgeDTOList(2);
        knowledgeDTOList.forEach(System.out::println);
    }

    @Test
    public void findKnowledgeDTOByPage() {
        PageRequest request = PageRequest.of(0, 5);
        Page<KnowledgeDTO> knowledgeDTOPage = knowledgeService.findKnowledgeDTOByPage(2, request);
        knowledgeDTOPage.getContent().forEach(System.out::println);
    }

    @Test
    public void remove() {
        knowledgeService.remove(26);
    }

    @Test
    public void edit() {
        KnowledgeAbilityDTO knowledgeAbilityDTO = new KnowledgeAbilityDTO();
        knowledgeAbilityDTO.setId(27);
        knowledgeAbilityDTO.setName("均摊分析");
        Knowledge result = knowledgeService.edit(knowledgeAbilityDTO);
        System.out.println(result);
    }

    @Test
    public void add() {
        KnowledgeAbilityDTO knowledgeAbilityDTO = new KnowledgeAbilityDTO();
        knowledgeAbilityDTO.setName("动态规划");
        knowledgeAbilityDTO.setCourseId(22);
        knowledgeAbilityDTO.setAbilityId(2);
        Knowledge result = knowledgeService.add(knowledgeAbilityDTO);
        System.out.println(result);
    }

    @Test
    public void treeAK() {
        List<CourseAKDTO> courseAKDTOS = knowledgeMapper.courseAKTree(36);
        HashMap<Integer, CourseAKDTO> map = new HashMap<>();
        for (CourseAKDTO akdto : courseAKDTOS) {
            map.put(akdto.getAbilityId(), akdto);
        }
        // 将能力点放入课程
        TreeDTO root = new TreeDTO();
        root.setName(courseAKDTOS.get(0).getPName());
        root.setChildren(new ArrayList<>());
        List<TreeDTO> children = root.getChildren();
        map.forEach((k,v)->{
            TreeDTO aRoot = new TreeDTO();
            aRoot.setId(v.getId());
            aRoot.setCourseId(v.getCourseId());
            aRoot.setAbilityId(k);
            aRoot.setName(v.getAName());
            children.add(aRoot);
        });

        // 将知识点放入能力点
        for (TreeDTO dto : children) {
            dto.setChildren(new ArrayList<>());
            List<TreeDTO> children1 = dto.getChildren();
            for (CourseAKDTO akdto : courseAKDTOS) {
                if (akdto.getAbilityId() == dto.getAbilityId()) {
                    TreeDTO kRoot = new TreeDTO();
                    kRoot.setId(akdto.getId());
                    kRoot.setCourseId(akdto.getCourseId());
                    kRoot.setAbilityId(akdto.getAbilityId());
                    kRoot.setName(akdto.getName());
                    children1.add(kRoot);
                }
            }
        }
        System.out.println(JSON.toJSONString(root));

    }
}