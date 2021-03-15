package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeTestMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Wdz
 * @Date 2021/3/12 16:24
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowLedgeTestRepositoryTest {
    @Autowired
    private KnowledgeTestRepository knowledgeTestRepository;
    @Resource
    private KnowledgeTestMapper knowledgeTestMapper;

    @Test
    public void test() {
        List<KnowledgeTest> all = knowledgeTestRepository.findAll();
        all.forEach(System.out::println);

    }
    @Test
    public void saveTest() {
        KnowledgeTest knowledgeTest = new KnowledgeTest();
        knowledgeTest.setName("在一个单链表中，若删除p所指结点的后续结点，则执行");
        knowledgeTest.setItem1("p = p->next; p->next = p->next->next;");
        knowledgeTest.setItem2("p = p->next; p->next = p->next;");
        knowledgeTest.setItem3("p->next = p->next->next;");
        knowledgeTest.setItem4("p = p->next->next;");
        knowledgeTest.setAns("C");
        knowledgeTest.setKnowledgeId(102);
        knowledgeTest.setChapterId(337);
        knowledgeTestRepository.save(knowledgeTest);
        List<KnowledgeTest> all = knowledgeTestRepository.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void listTest() {
        List<KnowledgeTest> list = knowledgeTestMapper.findListByCourseIdAndChapterId(83, 337);
        list.forEach(System.out::println);

    }

    @Test
    public void delectTest() {
        knowledgeTestMapper.deleteByPrimaryKey(8l);
    }

    @Test
    public void editTest() {
        KnowledgeTest knowledgeTest = knowledgeTestMapper.selectByPrimaryKey(11l);
        knowledgeTest.setAns("D");
        int i = knowledgeTestMapper.updateByPrimaryKey(knowledgeTest);
        System.out.println(i);
    }


}
