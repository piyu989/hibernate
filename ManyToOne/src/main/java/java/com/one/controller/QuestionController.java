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

import com.one.entity.Answer;
import com.one.entity.Question;
import com.one.repository.AnswerRepository;
import com.one.repository.QuestionRepository;

@RestController
public class QuestionController {
	@Autowired
	private QuestionRepository repo;
	@Autowired
	private AnswerRepository ansrepo;
	
	@PostMapping("/save")
	public Question save(@RequestBody Question q) {
		return repo.save(q);

	}
	 @PostMapping("/save/ans")
	 public Answer save(@RequestBody Answer id) {
	 	return ansrepo.save(id);
	 }
	
	@GetMapping()
	public String save() {
		return "sita ram";
	}
	
}
