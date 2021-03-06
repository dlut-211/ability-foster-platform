package edu.dlut.ssdut.abilityfosterplatform.controller;


import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTestPaperAnalysis;
import edu.dlut.ssdut.abilityfosterplatform.service.VKnowledgeTestPaperScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/resultanalysis")
@CrossOrigin
public class TestResultAnalysis {

    @Autowired
    private VKnowledgeTestPaperScoreService vKnowledgeTestPaperScoreService;


    @RequestMapping(value = "/analysis",method = RequestMethod.POST)
    public ArrayList<KnowledgeTestPaperAnalysis> getResultAnalysis(@RequestParam("paperId") String paperId)
    {
        Integer i=Integer.valueOf(paperId);
        System.out.println(paperId);
        return vKnowledgeTestPaperScoreService.getPaperAnalysis(i);
    }
}
