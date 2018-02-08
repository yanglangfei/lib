package com.yf.web.ai.web;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author YangLF
 * @date 2018/1/17
 */
@Controller
@Api(value = "IndexController", description = "首页接口")
public class IndexController {

    @ApiOperation(value = "跳转index", httpMethod = "GET", notes = "跳转index")
    @ApiImplicitParams({
        @ApiImplicitParam(required = true, name = "test", value = "教程入参"),
    })
    @GetMapping("/index")
    public String toIndex() {
        return "index";
    }

    @GetMapping("/websocket")
    public String websocket() {
        return "websocket";
    }
}
