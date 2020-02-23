package com.caltech.solutions.learning.management.service;

import com.caltech.solutions.learning.management.dto.GenericResponse;
import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "userAccess", url = "#{'${athena.default.url}' + '/user-accesses'}")
public interface UserAccessService {

    @GetMapping
    Object findAll();

    @DeleteMapping("/{id}")
    GenericResponse findById(@PathVariable String id);

    @PostMapping
    GenericResponse save(@RequestBody UserAccessTO userAccessTO);

    @PutMapping
    GenericResponse update(@RequestBody UserAccessTO userAccessTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id);
}
