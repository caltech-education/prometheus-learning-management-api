package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.learnerTO.LearnerTO;
import com.caltech.solutions.learning.management.service.LearnerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/learners")
@Api(value="Learner Controller", tags="Learner Controller")
public class LearnerController {

    private final LearnerService service;

    @Autowired
    LearnerController(LearnerService service) {
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
    public ResponseEntity save(@RequestBody LearnerTO learnerTO) {
        return ResponseEntity.ok(service.save(learnerTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody LearnerTO learnerTO) {
        return new ResponseEntity<>(service.update(learnerTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
