package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.PhoneBook;

@Repository
public interface PhoneBookRepository extends JpaRepository<PhoneBook, Integer> {
//	@Transactional
//	@Modifying
//	@Query("update PhoneBook u set u.name = ?1, u.email = ?2, u.phonenumber = ?3 where u.id = ?4")
//	void setPhoneBookInfoById(String name, String email, String  phonenumber,  Integer userId);
//	@Transactional
//	@Query("selcet PhoneBook u where u.name=?1 & u.email=?2 ")
//	PhoneBook getObject(String name, String email);
}
