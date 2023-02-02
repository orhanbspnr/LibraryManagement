package com.kodluyoruz.LibraryManagement.controller;

import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.service.BookServiceImpl;
import com.kodluyoruz.LibraryManagement.service.IBookService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookServiceImpl bookService;

    @GetMapping("/allbookslist")
    public List<Book> getAllBooks(){

        return bookService.getAllBooks();
    }
    @PostMapping("/savebook")
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);

    }

    @GetMapping("/findbookbyname")
    public Book findByName(@RequestParam String name){
        return bookService.findByName(name);
    }

    @DeleteMapping("deletebook")
    public void deleteBook(@RequestBody Book book){
        bookService.deleteBook(book);
    }



}
