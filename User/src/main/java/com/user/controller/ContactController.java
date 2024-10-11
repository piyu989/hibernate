package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Contact;
import com.user.repo.ContactRepository;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactRepository repo;
	
	@RequestMapping("/ans")
	public Contact save(@RequestBody Contact contact) {
		return repo.save(contact);
	}

}
