package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.staffTO.StaffTypeTO;
import com.caltech.solutions.learning.management.service.StaffTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staff-types")
@Api(value="Staff Type Controller", tags="Staff Type Controller")
public class StaffTypeController {

    private final StaffTypeService service;

    @Autowired
    StaffTypeController(StaffTypeService service) {
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
    public ResponseEntity save(@RequestBody StaffTypeTO staffTypeTO) {
        return ResponseEntity.ok(service.save(staffTypeTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody StaffTypeTO staffTypeTO) {
        return new ResponseEntity<>(service.update(staffTypeTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
