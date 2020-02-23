package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.quizTO.QuizTO;
import com.caltech.solutions.learning.management.service.QuizService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quizzes")
@Api(value="Quiz Controller", tags="Quiz Controller")
public class QuizController {

    private final QuizService service;

    @Autowired
    QuizController(QuizService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable String id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody QuizTO quizTO) {
        return ResponseEntity.ok(service.save(quizTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody QuizTO quizTO) {
        return new ResponseEntity<>(service.update(quizTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
