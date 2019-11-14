package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

/**
 * @Author :zjk
 * @Date :Create in 15:18 2019-11-14
 * @Description 修改密码DTO
 **/
@Data
public class UpdatePasswordDTO {
    Integer id;
    String oldPassword;
    String newPassword;
    String confirmPassword;
    Integer roles;
}
