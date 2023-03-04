package com.kodluyoruz.LibraryManagement.dao;

import com.kodluyoruz.LibraryManagement.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author, Long> {
    Author findByName(String name);
}
