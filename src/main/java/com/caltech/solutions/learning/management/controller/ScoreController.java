package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.subjectTO.ScoreTO;
import com.caltech.solutions.learning.management.service.ScoreService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scores")
@Api(value="Score Controller", tags="Score Controller")
public class ScoreController {

    private final ScoreService service;

    @Autowired
    ScoreController(ScoreService service) {
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
    public ResponseEntity save(@RequestBody ScoreTO scoreTO) {
        return ResponseEntity.ok(service.save(scoreTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody ScoreTO scoreTO) {
        return new ResponseEntity<>(service.update(scoreTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
