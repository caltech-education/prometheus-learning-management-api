package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.quizTO.QuizTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "quiz", url = "#{'${athena.default.url}' + '/quizzes'}")
public interface QuizService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody QuizTO quizTO);

    @PutMapping
    GenericResponse update(@RequestBody QuizTO quizTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
