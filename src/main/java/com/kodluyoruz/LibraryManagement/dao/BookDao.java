package com.kodluyoruz.LibraryManagement.dao;

import com.kodluyoruz.LibraryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookDao extends JpaRepository<Book,Long> {

    Book findByName(String name);



}
