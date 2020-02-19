package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.libraryTO.BookTO;
import com.caltech.solutions.learning.management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    @Autowired
    BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public Object findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Object findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Object save(@RequestBody BookTO bookTO) {
        return service.save(bookTO);
    }

    @PutMapping
    public Object update(@RequestBody BookTO bookTO) {
        return service.update(bookTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
