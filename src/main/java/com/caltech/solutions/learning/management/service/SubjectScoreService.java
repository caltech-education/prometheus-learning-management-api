package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectScoreTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "subjectScore", url = "#{'${athena.default.url}' + '/subjects-scores'}")
public interface SubjectScoreService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody SubjectScoreTO subjectScoreTO);

    @PutMapping
    GenericResponse update(@RequestBody SubjectScoreTO subjectScoreTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
