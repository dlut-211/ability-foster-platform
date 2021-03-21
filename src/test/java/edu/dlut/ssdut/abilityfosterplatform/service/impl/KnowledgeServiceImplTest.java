package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import com.alibaba.fastjson.JSON;
import edu.dlut.ssdut.abilityfosterplatform.dto.*;
import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeTestMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentKnowledgeTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Course;
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
    @Resource
    KnowledgeTestMapper knowledgeTestMapper;
    @Resource
    ClassroomTestRelationMapper classroomTestRelationMapper;
    @Resource
    StudentKnowledgeTestRelationMapper studentKnowledgeTestRelationMapper;


    @Test
    public void testDelect() {
//        int i = studentKnowledgeTestRelationMapper.deleteByIds(2, 3);
//        System.out.println(i);
        Map<String, Integer> map = studentKnowledgeTestRelationMapper.pieNums(2, 133);
        System.out.println(map);
    }

    @Test
    public void testUpdate() {
        int i = classroomTestRelationMapper.updateByClassIdAndkId(154, 10);
        System.out.println(i);
    }

    @Test
    public void testFindClassWork() {
        List<ClassTestDTO> info = knowledgeTestMapper.findClassWorkInfo(154, 362);
        info.forEach(System.out::println);
    }

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
        root.setId(courseAKDTOS.get(0).getCourseId());
        root.setChildren(new ArrayList<>());
        List<TreeDTO> children = root.getChildren();
        map.forEach((k,v)->{
            TreeDTO aRoot = new TreeDTO();
            aRoot.setId(v.getAbilityId());
//            aRoot.setCourseId(v.getCourseId());
//            aRoot.setAbilityId(k);
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
//                    kRoot.setCourseId(akdto.getCourseId());
//                    kRoot.setAbilityId(akdto.getAbilityId());
                    kRoot.setName(akdto.getName());
                    children1.add(kRoot);
                }
            }
        }
        System.out.println(JSON.toJSONString(root));

    }

    @Test
    public void test() {
        List<CourseAKDTO> courseAKDTOS = knowledgeMapper.courseAKTree(36);

        TreeDTO root = new TreeDTO();
//        if (courseAKDTOS.size() == 0) {
//            Course course = courseRepository.findById(courseId).orElse(null);
//            root.setName(course.getName());
//            root.setId(course.getId());
//            return root;
//        }
        root.setId(courseAKDTOS.get(0).getCourseId());
        root.setName(courseAKDTOS.get(0).getPName());
        root.setChildren(new ArrayList<>());
        List<TreeDTO> children = root.getChildren();

        HashMap<Integer, CourseAKDTO> map = new HashMap<>();
        for (CourseAKDTO akdto : courseAKDTOS) {
            map.put(akdto.getAbilityId(), akdto);
        }
        // 将能力点放入课程
        map.forEach((k,v)->{
            TreeDTO aRoot = new TreeDTO();
            aRoot.setId(v.getAbilityId());
//            aRoot.setCourseId(v.getCourseId());
//            aRoot.setAbilityId(k);
            aRoot.setName(v.getAName());
            children.add(aRoot);
        });

        // 将知识点放入能力点
        for (TreeDTO dto : children) {
            dto.setChildren(new ArrayList<>());
            List<TreeDTO> children1 = dto.getChildren();
            for (CourseAKDTO akdto : courseAKDTOS) {
                if (akdto.getAbilityId() == dto.getId()) {
                    TreeDTO kRoot = new TreeDTO();
                    kRoot.setId(akdto.getId());
//                    kRoot.setCourseId(akdto.getCourseId());
//                    kRoot.setAbilityId(akdto.getAbilityId());
                    kRoot.setName(akdto.getName());
                    children1.add(kRoot);
                }
            }
        }
        System.out.println(JSON.toJSONString(root));
    }

    @Test
    public void testQueue() {
        int[][] classes = {{1, 2}, {3, 5}, {2, 2}};
        int extraStudents = 2;
        int n = classes.length;
        // 定义优先队列，优先级按照增加 1 名学生之后能够产生的最大贡献来排序
        PriorityQueue<double[]> queue = new PriorityQueue<double[]>((o1, o2) -> {
            double x = ((o2[0] + 1) / (o2[1] + 1) - o2[0] / o2[1]);
            double y = ((o1[0] + 1) / (o1[1] + 1) - o1[0] / o1[1]);
            if (x > y) return 1;
            if (x < y) return -1;
            return 0;
        });

        // 转化为 double，方便小数计算
        for (int[] c : classes) {
            queue.offer(new double[]{c[0], c[1]});
        }

        // 分配学生，每次分配 1 名
        while (extraStudents > 0) {
            double[] maxClass = queue.poll(); //取出能够产生最大影响的班级
            maxClass[0] += 1.0; //通过的人数
            maxClass[1] += 1.0; //班级总人数
            queue.offer(maxClass); //将更新后的重新加入队列中
            extraStudents--;
        }

        // 计算最终结果
        double res = 0;
        while (!queue.isEmpty()) {
            double[] c = queue.poll();
            res += (c[0] / c[1]);
        }
        System.out.println(res / n);
    }

    @Test
    public void testLeetCode() {
        /**
         * 输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
         * 输出：[[1,0,1],[0,0,0],[1,0,1]]
         */



    }
}