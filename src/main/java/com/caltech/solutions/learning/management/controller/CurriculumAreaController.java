package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.subjectTO.CurriculumAreaTO;
import com.caltech.solutions.learning.management.service.CurriculumAreaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curriculum-area")
@Api(value="Curriculum Area Controller", tags="Curriculum Area Controller")
public class CurriculumAreaController {

    private final CurriculumAreaService service;

    @Autowired
    CurriculumAreaController(CurriculumAreaService service) {
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
    public ResponseEntity save(@RequestBody CurriculumAreaTO curriculumAreaTO) {
        return ResponseEntity.ok(service.save(curriculumAreaTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody CurriculumAreaTO curriculumAreaTO) {
        return new ResponseEntity<>(service.update(curriculumAreaTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
