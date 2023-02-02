package com.kodluyoruz.LibraryManagement.service;
import com.kodluyoruz.LibraryManagement.dao.BookDao;
import com.kodluyoruz.LibraryManagement.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements IBookService{
@Autowired
    BookDao bookDao;

public List<Book> getAllBooks(){
    return bookDao.findAll();
}
public void saveBook(Book book){
    bookDao.save(book);
}
public Book findByName(String name){
    return bookDao.findByName(name);
}

    public void deleteBook(Book book) {
    bookDao.delete(book);
    }
}
