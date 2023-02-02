package com.kodluyoruz.LibraryManagement.dao;

import com.kodluyoruz.LibraryManagement.model.LibraryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LibraryInfoDao extends JpaRepository<LibraryInfo,Long> {

}
