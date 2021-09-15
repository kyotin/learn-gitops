package com.tinnt.learn.gitops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class LearnGitopsApplication {

    @GetMapping("/")
    public String index() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(LearnGitopsApplication.class, args);
    }

}
