package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTestPaperAnalysis;

import java.util.ArrayList;

public interface VKnowledgeTestPaperScoreService {

    ArrayList<KnowledgeTestPaperAnalysis> getPaperAnalysis(int paperId);
}
