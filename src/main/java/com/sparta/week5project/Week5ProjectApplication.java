package com.sparta.week5project;

import com.sparta.week5project.daos.impl.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week5ProjectApplication {

    @Autowired
    private static EmployeeDAO employeeDAO;

    public static void main(String[] args) {

        SpringApplication.run(Week5ProjectApplication.class, args);

    }

}
