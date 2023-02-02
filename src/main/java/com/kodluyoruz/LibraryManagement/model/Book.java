package com.kodluyoruz.LibraryManagement.model;
import com.kodluyoruz.LibraryManagement.enums.BookType;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private int page;
    @Column
    private String author;
    @Enumerated(EnumType.STRING)
    @Column
    private BookType bookType;

    public Book(long id, String name, int page, String author, BookType bookType) {
        this.id = id;
        this.name = name;
        this.page = page;
        this.author = author;
        this.bookType = bookType;
    }

    public Book() {
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}
