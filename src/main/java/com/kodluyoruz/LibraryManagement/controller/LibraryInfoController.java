package com.kodluyoruz.LibraryManagement.controller;

import com.kodluyoruz.LibraryManagement.service.LibraryInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("libraryinfo")
public class LibraryInfoController {

    @Autowired
    LibraryInfoServiceImpl libraryInfo;




}
