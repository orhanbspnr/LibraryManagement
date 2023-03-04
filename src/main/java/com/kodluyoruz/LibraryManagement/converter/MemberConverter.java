package com.kodluyoruz.LibraryManagement.converter;

import com.kodluyoruz.LibraryManagement.dto.MemberDto;
import com.kodluyoruz.LibraryManagement.model.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberConverter extends Converter<Member, MemberDto>{
    @Override
    public MemberDto convert(Member member) {
        MemberDto memberDto = new MemberDto();
        memberDto.setId(member.getId());
        memberDto.setName(member.getName());
        memberDto.setSurname(member.getSurname());
        memberDto.setUserName(member.getUserName());
        memberDto.setPassword(member.getPassword());
        memberDto.setBooks(member.getBooks());
        return memberDto;
    }
}
