package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class Ability {
    private Integer id;

    private String name;

    private Integer createdby;

    private Date createdon;

    private Integer modifiedby;

    private Date modifiedon;

    private Integer subjectid;

    private String describe;

    private byte[] versionnumber;

}