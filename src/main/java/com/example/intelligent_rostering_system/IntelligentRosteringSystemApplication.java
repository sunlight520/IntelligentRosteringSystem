package com.example.intelligent_rostering_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ServletComponentScan
@Configuration
public class IntelligentRosteringSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelligentRosteringSystemApplication.class, args);
    }

}
