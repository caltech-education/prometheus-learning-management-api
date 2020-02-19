package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.libraryTO.BookTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;

@FeignClient(name = "book", url = "#{'${athena.default.url}' + '/books'}")
public interface BookService {

    @GetMapping
    Object findAll();

    @DeleteMapping("{id}")
    BookTO findById(@PathVariable String id);

    @PostMapping
    BookTO save(@RequestBody BookTO bookTO);

    @PutMapping
    BookTO update(@RequestBody BookTO bookTO);

    @DeleteMapping("{id}")
    void delete(@PathVariable String id);
}
