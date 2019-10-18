package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Ability {
    @Id
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
