package com.yf.web.ai.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/getOldData",method = RequestMethod.GET)
    public  String getOldData(){
        return "visit old data";

    }

}
