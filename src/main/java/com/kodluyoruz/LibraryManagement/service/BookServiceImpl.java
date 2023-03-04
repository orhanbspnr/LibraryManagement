package com.kodluyoruz.LibraryManagement.service;
import com.kodluyoruz.LibraryManagement.converter.AuthorConverter;
import com.kodluyoruz.LibraryManagement.converter.BookConverter;
import com.kodluyoruz.LibraryManagement.converter.MemberConverter;
import com.kodluyoruz.LibraryManagement.dao.AuthorDao;
import com.kodluyoruz.LibraryManagement.dao.BookDao;
import com.kodluyoruz.LibraryManagement.dao.MemberDao;
import com.kodluyoruz.LibraryManagement.dto.BookDto;
import com.kodluyoruz.LibraryManagement.model.Author;
import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService{
@Autowired
    BookDao bookDao;
@Autowired
    AuthorDao authorDao;
@Autowired
    MemberDao memberDao;
@Autowired
    BookConverter bookConverter;
@Autowired
    AuthorConverter authorConverter;
@Autowired
    MemberConverter memberConverter;

public List<BookDto> getAllBooks(){
    List<Book> bookList = bookDao.findAll();
    return  bookConverter.convertToList(bookList);
}public void saveBook(Book book){
    bookDao.save(book);
    bookConverter.convert(book);
}
public BookDto findByName(String name){

    Book book = bookDao.findByName(name);
    return bookConverter.convert(book);
}

    public void deleteBook(Book book) {

    bookDao.delete(book);
    bookConverter.convert(book);
    }

 public BookDto assignAuthorToBook(Long bookId,Long authorId){
      Book book = bookDao.findById(bookId).get();
      bookConverter.convert(book);
      Author author = authorDao.findById(authorId).get();
      authorConverter.convert(author);
      book.assignAuthor(author);
      bookDao.save(book);
      return bookConverter.convert(book);
  }
  public BookDto takeBook(Long bookId, Long memberId){
    Book book = bookDao.findById(bookId).get();
    bookConverter.convert(book);
    Member member = memberDao.findById(memberId).get();
    memberConverter.convert(member);
    book.takeBooks(member);
    bookDao.save(book);
    return bookConverter.convert(book);
  }


}
