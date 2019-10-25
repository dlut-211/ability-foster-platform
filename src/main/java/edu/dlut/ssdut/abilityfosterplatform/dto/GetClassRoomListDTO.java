package edu.dlut.ssdut.abilityfosterplatform.dto;

import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomList;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author YuJunMing
 * @Date 2019/10/25 10:17
 * DESCRIPTION:
 */
@Data
public class GetClassRoomListDTO {

    List<VClassroomList> list;

    Integer total;
}
