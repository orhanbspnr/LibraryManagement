package com.kodluyoruz.LibraryManagement.controller;

import com.kodluyoruz.LibraryManagement.dao.AuthorDao;
import com.kodluyoruz.LibraryManagement.dao.BookDao;
import com.kodluyoruz.LibraryManagement.dto.BookDto;
import com.kodluyoruz.LibraryManagement.model.Author;
import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.service.AuthorServiceImpl;
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
    @Autowired
    AuthorServiceImpl authorService;

    @Autowired
    BookDao bookDao;

    @Autowired
    AuthorDao authorDao;

    @GetMapping("/allbookslist")
    public List<BookDto> getAllBooks(){

        return bookService.getAllBooks();
    }
    @PostMapping(value = "/savebook",headers="Accept=application/json")
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);

    }

    @GetMapping("/findbookbyname")
    public BookDto findByName(@RequestParam String name){
        return bookService.findByName(name);
    }

    @DeleteMapping("deletebook")
    public void deleteBook(@RequestBody Book book){

        bookService.deleteBook(book);
    }

    @PutMapping("/{bookId}/author/{authorId}")
    BookDto assignAuthorToBook(@PathVariable Long bookId,@PathVariable Long authorId)
    {
        return bookService.assignAuthorToBook(bookId,authorId);

    }
    @PutMapping("/{bookId}/member/{memberId}")
    BookDto takeBook(@PathVariable Long bookId, @PathVariable Long memberId)
    {
     return bookService.takeBook(bookId, memberId);
    }



}
