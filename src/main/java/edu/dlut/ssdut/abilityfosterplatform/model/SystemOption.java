package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@Entity
public class SystemOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String optionCode;

    private String optionValue;

    private String optionType;

    private String optionTypeName;

    private Integer showOrder;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}