package edu.dlut.ssdut.abilityfosterplatform.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @Author YuJunMing
 * @Date 2019/10/25 7:11
 * DESCRIPTION:
 */
@Data
public class TestPaperIdDto {

    Integer testPaperId;

    Integer classRoomStudentId;

    Float score;

    Integer creatBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @Temporal(TemporalType.TIMESTAMP)
    Date CreatedBy;

}
