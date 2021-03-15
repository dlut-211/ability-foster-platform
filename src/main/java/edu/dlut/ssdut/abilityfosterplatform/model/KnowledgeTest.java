package edu.dlut.ssdut.abilityfosterplatform.model;

public class KnowledgeTest {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1 == null ? null : item1.trim();
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2 == null ? null : item2.trim();
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3 == null ? null : item3.trim();
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4 == null ? null : item4.trim();
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans == null ? null : ans.trim();
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}