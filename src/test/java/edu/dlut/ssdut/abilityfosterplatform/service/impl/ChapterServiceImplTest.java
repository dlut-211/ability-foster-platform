package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterTreeDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Chapter;
import edu.dlut.ssdut.abilityfosterplatform.service.ChapterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterServiceImplTest {

    @Autowired
    private ChapterService chapterService;

    @Test
    public void findByCourseId() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void delete() {
        chapterService.delete(177);
    }

    @Test
    public void add() {
        ChapterDTO chapterDTO = new ChapterDTO();
        chapterDTO.setChapterLevel(1);
        chapterDTO.setCourseId(99);
        chapterDTO.setName("测试用例-节");
        chapterDTO.setDescription("测试用例");
        chapterDTO.setParentId(null);
        Chapter result = chapterService.add(chapterDTO);
        System.out.println(result);
    }

    @Test
    public void edit() {
        ChapterDTO chapterDTO = new ChapterDTO();
        chapterDTO.setId(176);
        chapterDTO.setName("第二章 口语");
        Chapter chapter = chapterService.edit(chapterDTO);
        System.out.println(chapter);
    }

    @Test
    public void getChapterTree() {
        List<ChapterTreeDTO> chapterTreeDTOList = chapterService.getChapterTree(2);
        System.out.println(chapterTreeDTOList);
    }
}
