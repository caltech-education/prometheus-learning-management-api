package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.staffTO.StaffTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "staff", url = "#{'${athena.default.url}' + '/staffs'}")
public interface StaffService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody StaffTO staffTO);

    @PutMapping
    GenericResponse update(@RequestBody StaffTO staffTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
