package com.caltech.solutions.learning.management.controller;

import com.caltech.solutions.learning.management.dto.flashcardTO.FlashCardTO;
import com.caltech.solutions.learning.management.service.FlashCardService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flash-cards")
@Api(value="Flash Card Controller", tags="Flash Card Controller")
public class FlashCardController {

    private final FlashCardService service;

    @Autowired
    FlashCardController(FlashCardService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable String id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody FlashCardTO flashCardTO) {
        return ResponseEntity.ok(service.save(flashCardTO));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody FlashCardTO flashCardTO) {
        return new ResponseEntity<>(service.update(flashCardTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
