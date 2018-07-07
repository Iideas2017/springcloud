package com.zy.devtools_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevtoolsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevtoolsDemoApplication.class, args);
    }
    @RequestMapping("/hello")
    public String hello(){
            System.out.print("demo helssslo\n");
            return "hello,,,bbssbbsbww";
    }
}
