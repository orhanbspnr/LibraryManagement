package com.kodluyoruz.LibraryManagement.service;

import com.kodluyoruz.LibraryManagement.converter.AuthorConverter;
import com.kodluyoruz.LibraryManagement.converter.BookConverter;
import com.kodluyoruz.LibraryManagement.converter.MemberConverter;
import com.kodluyoruz.LibraryManagement.dao.AuthorDao;
import com.kodluyoruz.LibraryManagement.dao.BookDao;
import com.kodluyoruz.LibraryManagement.dao.MemberDao;
import com.kodluyoruz.LibraryManagement.dto.AuthorDto;
import com.kodluyoruz.LibraryManagement.dto.BookDto;
import com.kodluyoruz.LibraryManagement.dto.MemberDto;
import com.kodluyoruz.LibraryManagement.model.Author;
import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LibraryInfoService {

    @Autowired
    BookDao bookDao;
    @Autowired
    MemberDao memberDao;

    @Autowired
    AuthorDao authorDao;

    @Autowired
    MemberConverter memberConverter;
    @Autowired
    BookConverter bookConverter;
    @Autowired
    AuthorConverter authorConverter;

    public List<MemberDto> getAllMembers(){
        List<Member> memberList = memberDao.findAll();
        return memberConverter.convertToList(memberList);
    }
    public List<BookDto> getAllBook()
    {
        List<Book> bookList = bookDao.findAll();
        return bookConverter.convertToList(bookList);
    }
    public List<AuthorDto> getAllAuthors()
    {
        List<Author> authorList = authorDao.findAll();
        return authorConverter.convertToList(authorList);
    }
    public long getBookCount()
    {

        return bookDao.count();
    }
    public long getMemberCount()
    {
        return memberDao.count();
    }
    public long getAuthorCount()
    {
        return authorDao.count();
    }
}








