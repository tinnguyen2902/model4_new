package com.example.session3.Repository;

import com.example.session3.Model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // đánh dấu tầng truy xuất dữ liệu
public class AuthorRepository {
    // khai báo ds lưu trữ
    private final List<Author> authors = new ArrayList<>();
    // tạo constructor
    public AuthorRepository() {
        authors.add(new Author(1, "Nguyen van a", "a@gmail.com"));
        authors.add(new Author(2, "Nguyen van a2", "a2@gmail.com"));
        authors.add(new Author(3, "Nguyen van a3", "a3@gmail.com"));
        authors.add(new Author(4, "Nguyen van a4", "a4@gmail.com"));
    }
    // trả về all danh sách
    public List<Author> findAll(){
        return authors;
    };
}