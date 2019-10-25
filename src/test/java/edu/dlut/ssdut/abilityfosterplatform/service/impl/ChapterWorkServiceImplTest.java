package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterWorkDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Work;
import edu.dlut.ssdut.abilityfosterplatform.service.ChapterWorkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterWorkServiceImplTest {

    @Autowired
    private ChapterWorkService chapterWorkService;

    @Test
    public void remove() {
        chapterWorkService.remove(62);
    }

    @Test
    public void edit() {
        ChapterWorkDTO chapterWorkDTO = new ChapterWorkDTO();
        chapterWorkDTO.setId(64);
        chapterWorkDTO.setChapterId(1);
        chapterWorkDTO.setDescription("Test Case");
        List<Integer> idList = Arrays.asList(12, 14, 20);
        chapterWorkDTO.setKnowledgeIdList(idList);
        chapterWorkDTO.setName("Test Case-3");
        Work work = chapterWorkService.edit(chapterWorkDTO);
        System.out.println(work);
    }

    @Test
    public void add() {
        ChapterWorkDTO chapterWorkDTO = new ChapterWorkDTO();
        chapterWorkDTO.setChapterId(1);
        chapterWorkDTO.setDescription("Test Case");
        List<Integer> idList = Arrays.asList(12, 14, 15);
        chapterWorkDTO.setKnowledgeIdList(idList);
        chapterWorkDTO.setName("Test Case-1");
        Work work = chapterWorkService.add(chapterWorkDTO);
        System.out.println(work);
    }

    @Test
    public void list() {
        ChapterWorkDTO chapterWorkDTO = chapterWorkService.list(1);
        System.out.println(chapterWorkDTO);
        chapterWorkDTO.getWorkIdList().forEach(System.out::println);
        chapterWorkDTO.getWorkDTOList().forEach(System.out::println);
    }
}