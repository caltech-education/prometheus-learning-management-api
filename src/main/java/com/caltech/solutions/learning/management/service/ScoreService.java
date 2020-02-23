package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.subjectTO.ScoreTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "score", url = "#{'${athena.default.url}' + '/scores'}")
public interface ScoreService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody ScoreTO scoreTO);

    @PutMapping
    GenericResponse update(@RequestBody ScoreTO scoreTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
