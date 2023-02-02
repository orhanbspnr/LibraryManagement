package com.kodluyoruz.LibraryManagement.service;

import com.kodluyoruz.LibraryManagement.dao.LibraryInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryInfoServiceImpl implements ILibraryInfoService{
    @Autowired
    LibraryInfoDao libraryInfoDao;
}
