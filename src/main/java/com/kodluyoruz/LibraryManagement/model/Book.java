package com.kodluyoruz.LibraryManagement.model;
import com.kodluyoruz.LibraryManagement.enums.BookType;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private int page;
    @Enumerated(EnumType.STRING)
    @Column
    private BookType bookType;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;
    @ManyToMany
    @JoinTable(
            name = "take_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private Set<Member> takeBook = new HashSet<>();


    public Author getAuthor() {
        return author;
    }


    public Book(long id, String name, int page, BookType bookType) {
        this.id = id;
        this.name = name;
        this.page = page;
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


    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public void assignAuthor(Author author) {
        this.author = author;
    }


    public Set<Member> getTakeBook() {
        return takeBook;
    }

    public void takeBooks(Member member) {
        takeBook.add(member);
    }
}
