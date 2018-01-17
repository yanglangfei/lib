package com.yf.web.ai.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author YangLF
 * @date 2018/1/17
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public  String toIndex(){
        return "index";
    }



}
