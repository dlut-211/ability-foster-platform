package edu.dlut.ssdut.abilityfosterplatform.controller;


import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTestPaperAnalysis;
import edu.dlut.ssdut.abilityfosterplatform.service.VKnowledgeTestPaperScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/resultanalysis")
public class TestResultAnalysis {

    @Autowired
    private VKnowledgeTestPaperScoreService vKnowledgeTestPaperScoreService;


    @RequestMapping(value = "/analysis",method = RequestMethod.POST)
    public ArrayList<KnowledgeTestPaperAnalysis> getResultAnalysis(@RequestParam("paperId") int paperId)
    {
        return vKnowledgeTestPaperScoreService.getPaperAnalysis(paperId);
    }
}
