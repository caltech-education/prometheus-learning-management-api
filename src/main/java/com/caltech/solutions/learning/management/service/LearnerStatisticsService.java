package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.learnerTO.LearnerStatisticsTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "learnerStatistics", url = "#{'${athena.default.url}' + '/learner-statistics'}")
public interface LearnerStatisticsService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody LearnerStatisticsTO learnerStatisticsTO);

    @PutMapping
    GenericResponse update(@RequestBody LearnerStatisticsTO learnerStatisticsTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
