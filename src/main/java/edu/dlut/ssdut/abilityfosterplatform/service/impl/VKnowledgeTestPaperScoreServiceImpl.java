package edu.dlut.ssdut.abilityfosterplatform.service.impl;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VKnowledgeTestPaperScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTestPaperAnalysis;
import edu.dlut.ssdut.abilityfosterplatform.model.VKnowledgeTestPaperScore;
import edu.dlut.ssdut.abilityfosterplatform.service.VKnowledgeTestPaperScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VKnowledgeTestPaperScoreServiceImpl implements  VKnowledgeTestPaperScoreService{

    @Autowired
    private VKnowledgeTestPaperScoreMapper vKnowledgeTestPaperScoreMapper;

    @Override
    public ArrayList<KnowledgeTestPaperAnalysis> getPaperAnalysis(int paperId) {
        ArrayList<KnowledgeTestPaperAnalysis> knowledgeTestPaperAnalysisList=new ArrayList<>();
        ArrayList<VKnowledgeTestPaperScore> vKnowledgeTestPaperScoreArrayList=vKnowledgeTestPaperScoreMapper.selectByPaperId(paperId);

        String nameTmp=vKnowledgeTestPaperScoreArrayList.get(0).getName();
        int knowledgeID=vKnowledgeTestPaperScoreArrayList.get(0).getKnowledgeId();
        int level1=0;
        int level2=0;
        int level3=0;
        Double sumScore=vKnowledgeTestPaperScoreArrayList.get(0).getScoreSum();

        for(VKnowledgeTestPaperScore vKnowledgeTestPaperScore:vKnowledgeTestPaperScoreArrayList)
        {
            if(knowledgeID!=vKnowledgeTestPaperScore.getKnowledgeId()) {

                KnowledgeTestPaperAnalysis knowledgeTestPaperAnalysis=new KnowledgeTestPaperAnalysis();
                knowledgeTestPaperAnalysis.setLevel_1((double)level1/(level1+level2+level3));
                knowledgeTestPaperAnalysis.setLevel_2((double)level2/(level1+level2+level3));
                knowledgeTestPaperAnalysis.setLevel_3((double)level3/(level1+level2+level3));
                knowledgeTestPaperAnalysis.setKnowledgeName(nameTmp);
                knowledgeTestPaperAnalysis.setScore_sum(sumScore);
                knowledgeTestPaperAnalysisList.add(knowledgeTestPaperAnalysis);


                nameTmp = vKnowledgeTestPaperScore.getName();
                knowledgeID=vKnowledgeTestPaperScore.getKnowledgeId();
                level1 = 0;
                level2 = 0;
                level3 = 0;
                sumScore=vKnowledgeTestPaperScore.getScoreSum();
            }


            //sumScore=sumScore+vKnowledgeTestPaperScore.getScoreSum();
            if(vKnowledgeTestPaperScore.getScore()>vKnowledgeTestPaperScore.getScoreSum()*0.8)
            {
                level1++;
            }
            else if(vKnowledgeTestPaperScore.getScore()<vKnowledgeTestPaperScore.getScoreSum()*0.4)
            {
                level3++;
            }
            else
            {
                level2++;
            }

        }
        KnowledgeTestPaperAnalysis knowledgeTestPaperAnalysis=new KnowledgeTestPaperAnalysis();
        knowledgeTestPaperAnalysis.setLevel_1((double)level1/(level1+level2+level3));
        knowledgeTestPaperAnalysis.setLevel_2((double)level2/(level1+level2+level3));
        knowledgeTestPaperAnalysis.setLevel_3((double)level3/(level1+level2+level3));
        knowledgeTestPaperAnalysis.setKnowledgeName(nameTmp);
        knowledgeTestPaperAnalysis.setScore_sum(sumScore);
        knowledgeTestPaperAnalysisList.add(knowledgeTestPaperAnalysis);

        return knowledgeTestPaperAnalysisList;
    }
}
