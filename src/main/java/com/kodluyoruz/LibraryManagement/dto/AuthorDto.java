package com.kodluyoruz.LibraryManagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kodluyoruz.LibraryManagement.model.Book;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

public class AuthorDto {
    private long id;
    private String name;
    private String surname;
    private Set<Book> books = new HashSet<>();

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
