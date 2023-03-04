package com.kodluyoruz.LibraryManagement.dto;

import com.kodluyoruz.LibraryManagement.enums.BookType;
import com.kodluyoruz.LibraryManagement.model.Author;
import jakarta.persistence.*;

public class BookDto {
    private long id;
    private String name;
    private int page;
    private BookType bookType;
    private Author author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
