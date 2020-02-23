package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.staffTO.StaffTypeTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "staffType", url = "#{'${athena.default.url}' + '/staff-types'}")
public interface StaffTypeService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody StaffTypeTO staffTypeTO);

    @PutMapping
    GenericResponse update(@RequestBody StaffTypeTO staffTypeTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
