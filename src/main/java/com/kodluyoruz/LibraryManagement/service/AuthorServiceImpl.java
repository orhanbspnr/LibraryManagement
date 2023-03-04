package com.kodluyoruz.LibraryManagement.service;

import com.kodluyoruz.LibraryManagement.converter.AuthorConverter;
import com.kodluyoruz.LibraryManagement.converter.Converter;
import com.kodluyoruz.LibraryManagement.dao.AuthorDao;
import com.kodluyoruz.LibraryManagement.dto.AuthorDto;
import com.kodluyoruz.LibraryManagement.model.Author;
import com.kodluyoruz.LibraryManagement.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements IAuthorService{

    @Autowired
    AuthorDao authorDao;
    @Autowired
    AuthorConverter authorConverter;

    public List<AuthorDto> getAllAuthors() {
        List<Author> authorList = authorDao.findAll();
        return  authorConverter.convertToList(authorList);
    }
    public void saveAuthor(Author author)
    {
        authorDao.save(author);
        authorConverter.convert(author);
    }
    public AuthorDto findByName(String name)
    {
        Author author = authorDao.findByName(name);
        return  authorConverter.convert(author);
    }

    public void deleteAuthor(Author author)
    {
        authorDao.delete(author);
        authorConverter.convert(author);
    }
}
