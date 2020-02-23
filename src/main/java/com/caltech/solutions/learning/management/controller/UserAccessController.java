package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;
import com.caltech.solutions.learning.management.service.UserAccessService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-accesses")
@Api(value="User Access Controller", tags="User Access Controller")
public class UserAccessController {

    private final UserAccessService service;

    @Autowired
    UserAccessController(UserAccessService service) {
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
    public ResponseEntity save(@RequestBody UserAccessTO userAccessTO) {
        return ResponseEntity.ok(service.save(userAccessTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody UserAccessTO userAccessTO) {
        return new ResponseEntity<>(service.update(userAccessTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
