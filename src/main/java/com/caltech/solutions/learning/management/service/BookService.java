package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.libraryTO.BookTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "book", url = "#{'${athena.default.url}' + '/books'}")
public interface BookService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody BookTO bookTO);

    @PutMapping
    GenericResponse update(@RequestBody BookTO bookTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
