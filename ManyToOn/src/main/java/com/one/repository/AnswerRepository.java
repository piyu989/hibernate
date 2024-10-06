package com.one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
