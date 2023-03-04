package com.kodluyoruz.LibraryManagement.service;

import com.kodluyoruz.LibraryManagement.converter.MemberConverter;
import com.kodluyoruz.LibraryManagement.dao.BookDao;
import com.kodluyoruz.LibraryManagement.dao.MemberDao;
import com.kodluyoruz.LibraryManagement.dto.MemberDto;
import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.model.Member;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService {

    @Autowired
    MemberDao memberDao;
    @Autowired
    MemberConverter memberConverter;

    public List<MemberDto> getAllMembers() {
        List<Member> memberList = memberDao.findAll();
        return memberConverter.convertToList(memberList);
    }

    public void saveMember(Member member) {
        memberDao.save(member);
        memberConverter.convert(member);
    }

    public MemberDto findByUserName(String username) {
        Member member =memberDao.findByUserName(username);
        return memberConverter.convert(member);
    }

    public void deleteMember(Member member) {

        memberDao.delete(member);
        memberConverter.convert(member);
    }
}





