package com.kodluyoruz.LibraryManagement.configuration;

import com.kodluyoruz.LibraryManagement.dao.BookDao;
import com.kodluyoruz.LibraryManagement.dao.MemberDao;
import com.kodluyoruz.LibraryManagement.enums.BookType;
import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.model.Member;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BookConfig {

    @Autowired
    BookDao bookDao;
    @Autowired
    MemberDao memberDao;

    @PostConstruct
    public void insertInitData(){
        initBookData();
        initMemberData();


    }

    private void initMemberData(){
        Member member1 = new Member();
        member1.setName("membername1");
        member1.setSurname("membersurname1");
        member1.setUserName("memberusername1");
        member1.setPassword("memberpassword1");

        Member member2 = new Member();
        member2.setName("membername2");
        member2.setSurname("membersurname2");
        member2.setUserName("memberusername2");
        member2.setPassword("memberpassword2");

        memberDao.saveAll(Arrays.asList(member1,member2));
    }
    private void initBookData(){
        Book book1 = new Book();
        book1.setName("Harry Potter and the Philosopher's Stone");
        book1.setPage(276);
        book1.setAuthor("JK Rowling");
        book1.setBookType(BookType.FANTASY);

        Book book2 = new Book();
        book2.setName("The Little Prince");
        book2.setPage(96);
        book2.setAuthor("Antoine de Saint-Exupéry");
        book2.setBookType(BookType.ADVENTURE);

        Book book3 = new Book();
        book3.setName("The Da Vinci Code");
        book3.setPage(528);
        book3.setAuthor("Dan Brown");
        book3.setBookType(BookType.CRIME);

        Book book4 = new Book();
        book4.setName("Harry Potter and the Chamber of Secrets");
        book4.setPage(251);
        book4.setAuthor("JK Rowling");
        book4.setBookType(BookType.FANTASY);

        Book book5 = new Book();
        book5.setName("The Hobbit");
        book5.setPage(426);
        book5.setAuthor("JRR Tolkien");
        book5.setBookType(BookType.FANTASY);

        Book book6 = new Book();
        book6.setName("A Tale Of Two Cities");
        book6.setPage(288);
        book6.setAuthor("Charles Dickens");
        book6.setBookType(BookType.HISTORICAL_FICTION);

        Book book7 = new Book();
        book7.setName("Robinson Crusoe");
        book7.setPage(200);
        book7.setAuthor("Daniel Defoe");
        book7.setBookType(BookType.FICTION);

        Book book8 = new Book();
        book8.setName("Eylül");
        book8.setPage(376);
        book8.setAuthor("Mehmet Rauf");
        book8.setBookType(BookType.PYSCHOLOGICAL);

        Book book9 = new Book();
        book9.setName("Animal Farm");
        book9.setPage(112);
        book9.setAuthor("George Orwell");
        book9.setBookType(BookType.FICTION);

        Book book10 = new Book();
        book10.setName("Effective Java");
        book10.setPage(368);
        book10.setAuthor("Joshua Bloch");
        book10.setBookType(BookType.EDUCATIONAL);

        bookDao.saveAll(Arrays.asList(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10));




    }

    }
