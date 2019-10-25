package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeAbilityDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Knowledge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/23 21:11
 * @Description:
 **/
public interface KnowledgeService {

    List<KnowledgeDTO> findKnowledgeDTOList(Integer courseId);

    Page<KnowledgeDTO> findKnowledgeDTOByPage(Integer courseId, Pageable pageable);

    void remove(Integer id);

    Knowledge edit(KnowledgeAbilityDTO knowledgeAbilityDTO);

    Knowledge add(KnowledgeAbilityDTO knowledgeAbilityDTO);

}
