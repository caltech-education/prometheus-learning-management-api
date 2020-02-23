package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerRegistrationTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "learnerRegistration", url = "#{'${athena.default.url}' + '/learner-registrations'}")
public interface LearnerRegistrationService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody LearnerRegistrationTO learnerRegistrationTO);

    @PutMapping
    GenericResponse update(@RequestBody LearnerRegistrationTO learnerRegistrationTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
