package com.kodluyoruz.LibraryManagement.model;

import com.kodluyoruz.LibraryManagement.dao.BookDao;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "LIBRARYINFO")
public class LibraryInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_BOOK", foreignKey = @ForeignKey(name = "FK_LIBRARYINFO_BOOK"))
    private Book book;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_MEMBER", foreignKey = @ForeignKey(name = "FK_LIBRARYINFO_MEMBER"))
    private Member member;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
