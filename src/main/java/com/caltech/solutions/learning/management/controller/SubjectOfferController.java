package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.institutionTO.SubjectOfferTO;
import com.caltech.solutions.learning.management.service.SubjectOfferSerivce;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subjects-offered")
@Api(value="Subject Offer Controller", tags="Subject Offer Controller")
public class SubjectOfferController {

    private final SubjectOfferSerivce service;

    @Autowired
    SubjectOfferController(SubjectOfferSerivce service) {
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
    public ResponseEntity save(@RequestBody SubjectOfferTO subjectOfferTO) {
        return ResponseEntity.ok(service.save(subjectOfferTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody SubjectOfferTO subjectOfferTO) {
        return new ResponseEntity<>(service.update(subjectOfferTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
