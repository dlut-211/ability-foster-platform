package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.service.AbilityService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: raymond
 * @Date 2019/10/16 13:14
 * @Description: 能力点 控制层
 **/
@Api(tags = "AbilityController")
@RestController
@RequestMapping("/api/ability")
public class AbilityController {

    @Autowired
    private AbilityService abilityService;

    @ApiOperation("按能力点id查询能力点")
    @GetMapping("/selectById")
    public ResultVO selectById(@RequestParam("id") Integer id) {
        return ResultVOUtil.success(abilityService.selectByPrimaryKey(id));
    }
}
