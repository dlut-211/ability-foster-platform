package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.List;

@Data
public class TestPaperListDTO {
    List<TestPaperListDetailDTO> A;
    List<TestPaperListDetailDTO> B;
}
