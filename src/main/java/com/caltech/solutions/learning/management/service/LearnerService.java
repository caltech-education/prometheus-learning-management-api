package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "learner", url = "#{'${athena.default.url}' + '/learners'}")
public interface LearnerService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody LearnerTO learnerTO);

    @PutMapping
    GenericResponse update(@RequestBody LearnerTO learnerTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
