package com.example.session3.Controller;

import com.example.session3.Model.Author;
import com.example.session3.Repository.AuthorRepository;
import com.example.session3.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // giúp nhận yêu cầu rồi gọi sang Servise
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    // kết nối với Repository
    private AuthorRepository authorRepository;
    private AuthorService authorService;
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
    // cập nhật
    @PostMapping
    public Author create(@RequestBody Author author){
        // log ra
        System.out.println("Thêm tác giá" + author);
        return authorService.createAuthor(author);
    }
}