package com.example.session3.Service;

import com.example.session3.Model.Author;
import com.example.session3.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // đóng vai trò tầng nghiệp vụ trung gian
public class AuthorService {
    @Autowired  // tiêm phụ thuộc
    // kết nối với AuthorRespository
    private AuthorRepository authorRepository;
    // hàm gọi sang Repository
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

}