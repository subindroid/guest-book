package com.marumiru.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marumiru.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
