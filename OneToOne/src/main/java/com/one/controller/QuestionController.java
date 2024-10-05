package com.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.entity.Question;
import com.one.repository.QuestionRepository;

@RestController
public class QuestionController {
	@Autowired
	private QuestionRepository repo;
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public Question save(@RequestBody Question q) {
		// System.out.println("sita ram");
		return repo.save(q);
	}
	// @PostMapping("/{id}")
	// public Question save(@PathVariable int id) {
	// 	System.out.println("sita ram");
	// 	Question q=new Question();
	// 	q.setId(id);
	// 	q.setQuestion("qw");
	// 	return repo.save(q);
	// }
	
	@GetMapping()
	public String save() {
		return "sita ram";
	}
	
}
