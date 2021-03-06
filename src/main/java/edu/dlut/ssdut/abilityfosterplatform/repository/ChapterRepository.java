package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

    List<Chapter> findByCourseIdOrderBySort(Integer id);

    List<Chapter> findAllByParentId(Integer parentId);

    List<Chapter> findAllByChapterLevelAndParentIdAndCourseId(Integer chapterLevel, Integer parentId, Integer courseId);

}
