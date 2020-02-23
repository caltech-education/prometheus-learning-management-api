package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.learnerTO.LearnerRegistrationTO;
import com.caltech.solutions.learning.management.service.LearnerRegistrationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/learner-registrations")
@Api(value="Learner Registration Controller", tags="Leaner Registration Controller")
public class LearnerRegistrationController {

    private final LearnerRegistrationService service;

    @Autowired
    LearnerRegistrationController(LearnerRegistrationService service) {
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
    public ResponseEntity save(@RequestBody LearnerRegistrationTO learnerRegistrationTO) {
        return ResponseEntity.ok(service.save(learnerRegistrationTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody LearnerRegistrationTO learnerRegistrationTO) {
        return new ResponseEntity<>(service.update(learnerRegistrationTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
