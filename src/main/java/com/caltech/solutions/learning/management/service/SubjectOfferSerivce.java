package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.institutionTO.SubjectOfferTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "subjectOffer", url = "#{'${athena.default.url}' + '/subjects-offered'}")
public interface SubjectOfferSerivce {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody SubjectOfferTO subjectOfferTO);

    @PutMapping
    GenericResponse update(@RequestBody SubjectOfferTO subjectOfferTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
