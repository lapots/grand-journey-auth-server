package com.lapots.game.journey.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import javax.annotation.Resource;

@SpringBootApplication
@EnableEurekaClient
public class GrandJourneyAuthApplication {

    @Resource
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(GrandJourneyAuthApplication.class, args);
    }
}
