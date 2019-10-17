package edu.dlut.ssdut.abilityfosterplatform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.dlut.ssdut.abilityfosterplatform.enums.TermTypeEnum;
import edu.dlut.ssdut.abilityfosterplatform.utils.EnumUtil;
import lombok.Data;

import java.util.Date;

/**
 * @Author: raymond
 * @Date 2019/10/17 16:00
 * @Description:
 **/
@Data
public class VWdzclassroom {

    private Integer studentid;

    private String code;

    private String name;

    private Integer termtype;

    private Date begindate;

    private Date enddate;

    private Integer status;

    @JsonIgnore
    public TermTypeEnum getTermTypeEnum() {
        return EnumUtil.getByCode(termtype, TermTypeEnum.class);
    }

}
