package com.nexaplaform.authserver.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nexaplaform.authserver", "com.nexaplaform.core.api"})
public class MicAuthserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicAuthserverApplication.class, args);
    }
}
