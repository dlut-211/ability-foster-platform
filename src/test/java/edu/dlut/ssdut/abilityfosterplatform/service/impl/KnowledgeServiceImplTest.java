package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeAbilityDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Knowledge;
import edu.dlut.ssdut.abilityfosterplatform.repository.KnowledgeRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.KnowledgeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledgeServiceImplTest {

    @Autowired
    private KnowledgeService knowledgeService;

    @Test
    public void findKnowledgeDTOList() {
        List<KnowledgeDTO> knowledgeDTOList = knowledgeService.findKnowledgeDTOList(2);
        knowledgeDTOList.forEach(System.out::println);
    }

    @Test
    public void findKnowledgeDTOByPage() {
        PageRequest request = PageRequest.of(0, 10);
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
}