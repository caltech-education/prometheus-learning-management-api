package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.subjectTO.CurriculumAreaTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "curriculumArea", url = "#{'${athena.default.url}' + '/curriculum-area'}")
public interface CurriculumAreaService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody CurriculumAreaTO curriculumAreaTO);

    @PutMapping
    GenericResponse update(@RequestBody CurriculumAreaTO curriculumAreaTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
