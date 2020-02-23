package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.institutionTO.GradeTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "grade", url = "#{'${athena.default.url}' + '/grades'}")
public interface GradeService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody GradeTO gradeTO);

    @PutMapping
    GenericResponse update(@RequestBody GradeTO gradeTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
