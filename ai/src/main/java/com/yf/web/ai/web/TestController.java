package com.yf.web.ai.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ylf
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/getOldData",method = RequestMethod.GET)
    public  String getOldData(){
        String name = null;
        if(name.endsWith("www")){
            return "www";
        }
        return "visit old data";
    }
}
