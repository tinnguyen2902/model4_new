package com.example.session3;

import com.example.session3.Model.Author;
import com.example.session3.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Session3Application {
    @Autowired
    private AuthorRepository ar;
    public static void main(String[] args) {
        SpringApplication.run(Session3Application.class, args);
    }
    @GetMapping("/link")
    public List<Author> authors(){
        System.out.println("đã vào");
        return ar.findAll();
    }
}
