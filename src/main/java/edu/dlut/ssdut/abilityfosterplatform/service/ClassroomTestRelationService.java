package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;

import java.util.List;

public interface ClassroomTestRelationService {
    List<KnowledgeTest> getALlTestById(int chapterId, int classroomId);
}