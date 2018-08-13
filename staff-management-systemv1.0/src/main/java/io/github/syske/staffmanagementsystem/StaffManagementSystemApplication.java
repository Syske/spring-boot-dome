package io.github.syske.staffmanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.syske.staffmanagementsystem.dao")
public class StaffManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffManagementSystemApplication.class, args);
    }
}
