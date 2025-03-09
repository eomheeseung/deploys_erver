package org.example.securitylogintesteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SecurityLoginTestEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityLoginTestEurekaApplication.class, args);
    }

}
