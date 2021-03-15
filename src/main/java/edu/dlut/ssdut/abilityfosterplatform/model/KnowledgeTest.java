package edu.dlut.ssdut.abilityfosterplatform.model;



import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class KnowledgeTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String item1;

    private String item2;

    private String item3;

    private String item4;

    private String ans;

    private Integer knowledgeId;

    private Integer chapterId;

    private Integer courseId;

}