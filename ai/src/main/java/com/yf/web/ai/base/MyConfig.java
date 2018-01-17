package com.yf.web.ai.base;

import com.yf.web.ai.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注入bean
 * @author YangLF
 * @date 2018/1/17
 */
@Configuration
public class MyConfig {

    @Bean
    public  User  createDefaultUser(){
        User user=new User();
        user.setId(1L);
        user.setName("defaultName");
        return  user;
    }

}
