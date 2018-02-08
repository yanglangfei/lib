package com.yf.web.ai.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 注意修改此处的包名
                .apis(RequestHandlerSelectors.basePackage("com.yf.web.ai"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 任意，请稍微规范点
                .title("API Docs")
                // 任意，请稍微规范点
                .description("API Docs for Swagger")
                .termsOfServiceUrl("http://yf.com")
                // 无所谓（这里是作者的别称）
                .contact(new Contact("fengerous","http://yc.blog.com","185601452@gmail.com"))
                .version("1.0.0")
                .build();
    }

}
