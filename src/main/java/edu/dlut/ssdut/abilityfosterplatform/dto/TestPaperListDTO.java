package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.List;
/**
 * @Author YuJunMing
 * @Date 2019/10/27 12:53
 * DESCRIPTION:
 */
@Data
public class TestPaperListDTO {
    List<TestPaperListDetailDTO> A;
    List<TestPaperListDetailDTO> B;
}
