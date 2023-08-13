package com.web;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableApolloConfig //开启apollo
@EnableConfigurationProperties
@SpringBootApplication
public class SpringbootApolloClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApolloClientApplication.class, args);
    }

}
