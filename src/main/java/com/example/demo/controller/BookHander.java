package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookHander {
    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/findall")
    public List<Book> findAll(){
        return bookRepository.findAll();

    }



}
