package com.ironhack.opponentselectionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OpponentSelectionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpponentSelectionServiceApplication.class, args);
    }

}
