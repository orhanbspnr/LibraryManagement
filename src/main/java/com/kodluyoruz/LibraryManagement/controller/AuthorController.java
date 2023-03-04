package com.kodluyoruz.LibraryManagement.controller;

import com.kodluyoruz.LibraryManagement.dto.AuthorDto;
import com.kodluyoruz.LibraryManagement.model.Author;
import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorServiceImpl authorService;

    @GetMapping("/allauthorslist")
    public List<AuthorDto> getAllAuthors(){

        return authorService.getAllAuthors();
    }
    @PostMapping("/saveauthor")
    public void saveAuthor(@RequestBody Author author){
        authorService.saveAuthor(author);

    }

    @GetMapping("/findauthorbyname")
    public AuthorDto findByName(@RequestParam String name)
    {
        return authorService.findByName(name);
    }

    @DeleteMapping("deleteauthor")
    public void deleteAuthor(@RequestBody Author author){

        authorService.deleteAuthor(author);
    }
}
