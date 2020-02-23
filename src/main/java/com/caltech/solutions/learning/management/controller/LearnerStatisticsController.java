package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.learnerTO.LearnerStatisticsTO;
import com.caltech.solutions.learning.management.service.LearnerStatisticsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/learner-statistics")
@Api(value="Learner Statistics Controller", tags="Learner Statistics Controller")
public class LearnerStatisticsController {

    private final LearnerStatisticsService service;

    @Autowired
    LearnerStatisticsController(LearnerStatisticsService service) {
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
    public ResponseEntity save(@RequestBody LearnerStatisticsTO learnerStatisticsTO) {
        return ResponseEntity.ok(service.save(learnerStatisticsTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody LearnerStatisticsTO learnerStatisticsTO) {
        return new ResponseEntity<>(service.update(learnerStatisticsTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
