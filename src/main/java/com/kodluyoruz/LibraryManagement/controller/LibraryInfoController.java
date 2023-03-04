package com.kodluyoruz.LibraryManagement.controller;

import com.kodluyoruz.LibraryManagement.service.LibraryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/librayinfo")
public class LibraryInfoController {

    @Autowired
    LibraryInfoService libraryInfo;

    @GetMapping("/getbookcount")
    public long getBookCount(){
        return libraryInfo.getBookCount();
    }
    @GetMapping("/getmembercount")
    public long getMemberCount(){
        return libraryInfo.getMemberCount();
    }
    @GetMapping("/getauthorcount")
    public long getAuthorCount(){
        return libraryInfo.getAuthorCount();
    }

}
