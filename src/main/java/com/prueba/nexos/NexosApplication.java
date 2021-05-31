package com.prueba.nexos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NexosApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexosApplication.class, args);
    }

}
