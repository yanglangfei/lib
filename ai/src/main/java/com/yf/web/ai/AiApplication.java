package com.yf.web.ai;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Order(value = 1)
@EnableSwagger2
public class AiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AiApplication.class, args);
	}

	@Override
	public  void  run(String ...args){
		//实现  CommandLineRunner 重写 run 方式 在spring boot 启动时运行
		// @Order 注解设置 value 可以设置执行顺序 执行优先级是按value值从小到大顺序
      System.out.println("执行..command");

	}

}
