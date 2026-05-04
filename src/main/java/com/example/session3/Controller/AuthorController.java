package com.example.session3.Controller;

import com.example.session3.Model.Author;
import com.example.session3.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // giúp nhận yêu cầu rồi gọi sang Servise
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    // kết nối với Repository
    private AuthorRepository authorRepository;
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
}