package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.subjectTO.SubjectScoreTO;
import com.caltech.solutions.learning.management.service.SubjectScoreService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subjects-scores")
@Api(value="Subject Score Controller", tags="Subject Score Controller")
public class SubjectScoreController {

    private final SubjectScoreService service;

    @Autowired
    SubjectScoreController(SubjectScoreService service) {
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
    public ResponseEntity save(@RequestBody SubjectScoreTO subjectScoreTO) {
        return ResponseEntity.ok(service.save(subjectScoreTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody SubjectScoreTO subjectScoreTO) {
        return new ResponseEntity<>(service.update(subjectScoreTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
