package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.institutionTO.GradeTO;
import com.caltech.solutions.learning.management.service.GradeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grades")
@Api(value="Grade Controller", tags="Grade Controller")
public class GradeController {

    private final GradeService service;

    @Autowired
    GradeController(GradeService service) {
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
    public ResponseEntity save(@RequestBody GradeTO gradeTO) {
        return ResponseEntity.ok(service.save(gradeTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody GradeTO gradeTO) {
        return new ResponseEntity<>(service.update(gradeTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
