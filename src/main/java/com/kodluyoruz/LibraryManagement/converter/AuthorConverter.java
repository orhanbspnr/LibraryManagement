package com.kodluyoruz.LibraryManagement.converter;

import com.kodluyoruz.LibraryManagement.dto.AuthorDto;
import com.kodluyoruz.LibraryManagement.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorConverter extends Converter<Author, AuthorDto>{
    @Override
    public AuthorDto convert(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());
        authorDto.setSurname(author.getSurname());
        authorDto.setBooks(author.getBooks());
        return authorDto;
    }
}
