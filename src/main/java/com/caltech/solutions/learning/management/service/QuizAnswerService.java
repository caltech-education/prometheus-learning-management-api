package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.quizTO.QuizAnswerTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "quizAnswer", url = "#{'${athena.default.url}' + '/quiz-answers'}")
public interface QuizAnswerService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody QuizAnswerTO quizAnswerTO);

    @PutMapping
    GenericResponse update(@RequestBody QuizAnswerTO quizAnswerTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
