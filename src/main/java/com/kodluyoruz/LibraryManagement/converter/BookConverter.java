package com.kodluyoruz.LibraryManagement.converter;
import com.kodluyoruz.LibraryManagement.dto.BookDto;
import com.kodluyoruz.LibraryManagement.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookConverter extends Converter<Book,BookDto> {
    @Override
    public BookDto convert(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setPage(book.getPage());
        bookDto.setBookType(book.getBookType());
        bookDto.setAuthor(book.getAuthor());
        return bookDto;
    }
}
