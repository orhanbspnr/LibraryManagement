package com.kodluyoruz.LibraryManagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kodluyoruz.LibraryManagement.model.Book;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

public class MemberDto {
    private long id;
    private String name;
    private String surname;
    private String userName;
    private  String password;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
