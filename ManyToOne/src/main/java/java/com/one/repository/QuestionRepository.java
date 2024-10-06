package com.one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
