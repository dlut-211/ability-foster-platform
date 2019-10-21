package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.SystemOptionService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.time.DateTimeException;
import java.util.Date;

/**
 * @Author: lhd
 * @Date 2019/10/17
 * @Description:
 **/
@Api(tags = "SystemOptionController")
@RestController
@RequestMapping("/api/MySystem")
public class SystemOptionController {

    @Autowired
    private SystemOptionService systemOptionService;
    @Autowired
    private SystemOptionRepository systemOptionRepository;

    @ApiOperation("获取列表")
    @GetMapping("/list")
    public ResultVO getList(@RequestParam(value ="page",defaultValue = "1") Integer page, @RequestParam(value ="limit",defaultValue = "10") Integer limit, @RequestParam(value ="optionCode",defaultValue = "")String OptionCode, @RequestParam(value ="optionValue",defaultValue = "")String OptionValue) {
        PageRequest request = PageRequest.of(page-1, limit);
        Page<SystemOption> systemOptionPage;
        if (OptionCode.isEmpty() && OptionValue.isEmpty())
        {
            systemOptionPage = systemOptionRepository.findAll(request);
        }else if (!OptionValue.isEmpty() && OptionCode.isEmpty())
        {
            systemOptionPage = systemOptionRepository.findSystemOptionsByOptionValueContains(OptionValue,request);
        }
        else if (!OptionCode.isEmpty() && OptionValue.isEmpty()){
            systemOptionPage = systemOptionRepository.findSystemOptionsByOptionCodeEquals(OptionCode,request);
        }else{
            systemOptionPage = systemOptionRepository.findSystemOptionsByOptionValueContainsAndOptionCodeEquals(OptionValue,OptionCode,request);
        }
        return ResultVOUtil.success(systemOptionPage);
    }

    @ApiOperation("添加条目")
    @PostMapping("/add")
    public ResultVO addSystemOption(SystemOption systemOption) {
        systemOption.setCreatedOn(new Date());
        systemOption.setShowOrder(1);
        systemOption.setCreatedBy(1);
//        return ResultVOUtil.success(systemOptionService.insertSelective(systemOption));
        return  ResultVOUtil.success(systemOptionRepository.saveAndFlush(systemOption));
    }

    @ApiOperation("编辑条目")
    @PutMapping("/edit")
    public ResultVO editSystemOption(SystemOption systemOption) {
        systemOption.setModifiedBy(1);
        systemOption.setModifiedOn(new Date());
        return ResultVOUtil.success(systemOptionService.updateByPrimaryKeySelective(systemOption));
    }

    @ApiOperation("删除条目")
    @DeleteMapping("/remove")
    public ResultVO removeSystemOption(@RequestParam(value ="id") Integer id) {
        systemOptionRepository.deleteById(id);
        return ResultVOUtil.success();
    }
}
