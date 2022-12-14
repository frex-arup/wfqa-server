package com.wfqa.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *This class contains configurations for swagger UI. 
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wfqa"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        @SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo(
                "wfqa",
                "An application for wfqa activities",
                "v1",
                "Terms of service",
                "wfqa@gmail.com",
                "License of API",
                "https://swagger.io/docs/");
        return apiInfo;
    }
}
