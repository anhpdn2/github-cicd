package com.ducanh.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class GithubCicdApplication {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to ducanh";
    }
    public static void main(String[] args) {
        SpringApplication.run(GithubCicdApplication.class, args);
    }
    /*echo "# github-cicd" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/anhpdn2/github-cicd.git
    git push -u origin main*/
}
