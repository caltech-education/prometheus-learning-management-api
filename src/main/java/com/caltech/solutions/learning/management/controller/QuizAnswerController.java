package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.quizTO.QuizAnswerTO;
import com.caltech.solutions.learning.management.service.QuizAnswerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz-answers")
@Api(value="Quiz Answer Controller", tags="Quiz Answer Controller")
public class QuizAnswerController {

    private final QuizAnswerService service;

    @Autowired
    QuizAnswerController(QuizAnswerService service) {
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
    public ResponseEntity save(@RequestBody QuizAnswerTO quizAnswerTO) {
        return ResponseEntity.ok(service.save(quizAnswerTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody QuizAnswerTO quizAnswerTO) {
        return new ResponseEntity<>(service.update(quizAnswerTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
