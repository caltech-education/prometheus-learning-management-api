package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.flashcardTO.FlashCardTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "flashCard", url = "#{'${athena.default.url}' + '/flash-cards'}")
public interface FlashCardService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody FlashCardTO flashCardTO);

    @PutMapping
    GenericResponse update(@RequestBody FlashCardTO flashCardTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
