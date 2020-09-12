package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.PhoneBook;
import com.example.repository.PhoneBookRepository;

@Service
public class PhoneBookService {
	
     @Autowired
     private PhoneBookRepository bookRepository;
	public String insert(PhoneBook book) {
      bookRepository.save(book);
    return "Suceess";
		
	}
	public List<PhoneBook> getAllRecords() {
		
		return bookRepository.findAll();
	}
	public void editContact(PhoneBook book) {
		//PhoneBook object = bookRepository.getObject(book.getName(), book.getEmail());
		//System.out.println(object);
		
	//bookRepository.setPhoneBookInfoById(book.getName(), book.getEmail(), book.getPhonenumber(), 2);
	}
	
	

}
