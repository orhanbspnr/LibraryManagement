package com.kodluyoruz.LibraryManagement.dao;

import com.kodluyoruz.LibraryManagement.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDao extends JpaRepository<Member,Long> {
    Member findByUserName(String username);


}
