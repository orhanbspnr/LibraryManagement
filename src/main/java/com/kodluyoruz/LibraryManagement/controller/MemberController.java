package com.kodluyoruz.LibraryManagement.controller;

import com.kodluyoruz.LibraryManagement.dto.MemberDto;
import com.kodluyoruz.LibraryManagement.model.Book;
import com.kodluyoruz.LibraryManagement.model.Member;
import com.kodluyoruz.LibraryManagement.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
@Autowired
    MemberServiceImpl memberService;

    @GetMapping("/allmemberslist")
    public List<MemberDto> getAllMembers(){

        return memberService.getAllMembers();
    }
    @PostMapping("/savemember")
    public void saveMember(@RequestBody Member member){
        memberService.saveMember(member);

    }

    @GetMapping("/findmemberbyusername")
    public MemberDto findByUserName(@RequestParam String username){

        return memberService.findByUserName(username);
    }

    @DeleteMapping("deletemember")
    public void deleteMember(@RequestBody Member member){

        memberService.deleteMember(member);
    }

}
