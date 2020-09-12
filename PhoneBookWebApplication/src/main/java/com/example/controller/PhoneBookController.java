package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.PhoneBook;
import com.example.service.PhoneBookService;

@Controller

public class PhoneBookController {
	
	@Autowired
 private PhoneBookService phonebookService;	
	
@GetMapping("/")
public String insert(Model model)
{
	PhoneBook phoneBook=new PhoneBook();
	
	model.addAttribute("phoneBookObj", phoneBook);
	
	return "index";
}
@PostMapping("/save")
public String handleSubmitBtn(@ModelAttribute("phoneBookObj") PhoneBook book,RedirectAttributes model)
{
	model.addFlashAttribute("smsg", "Succesfully");
	phonebookService.insert(book);
	System.out.println("Succcccccccccccc"+book.getEmail());
	return "redirect:/succesMsg";
}
@GetMapping("/succesMsg")
public String handleAddCtctHyperLink(Model model)
{
	//phonebookService.editContact(book);
	model.addAttribute("phoneBookObj", new PhoneBook());
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	return "index";
}
}
