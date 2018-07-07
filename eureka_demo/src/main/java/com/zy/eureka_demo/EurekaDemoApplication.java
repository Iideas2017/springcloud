package com.zy.eureka_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDemoApplication {

    public static void main(String[] args) {
        /*System.out.print("input:");
        Scanner scanner=new Scanner(System.in);
        String profiles=scanner.nextLine();
        new SpringApplicationBuilder(EurekaDemoApplication.class).profiles(profiles).run(args);*/
        SpringApplication.run(EurekaDemoApplication.class, args);
    }
}
