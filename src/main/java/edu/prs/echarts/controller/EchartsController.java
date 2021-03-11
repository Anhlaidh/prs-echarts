package edu.prs.echarts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: EchartsController
 * @description:
 * @author:Anhlaidh
 * @create: 2021/3/10 0010 22:17
 */
@Controller
public class EchartsController {
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
