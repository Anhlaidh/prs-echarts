package edu.prs.echarts.controller;

import edu.prs.echarts.Mapper.StationInfoMapper;
import edu.prs.echarts.Model.StationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: EchartsController
 * @description:
 * @author:Anhlaidh
 * @create: 2021/3/10 0010 22:17
 */
@Controller
public class EchartsController {
    @Autowired
    StationInfoMapper mapper;
    @RequestMapping(value = "example",method = RequestMethod.GET)
    public String example() {



        return "/index";
    }

    @RequestMapping("rest")
    @ResponseBody
    public String rest() {
        return "hello";
    }


}
