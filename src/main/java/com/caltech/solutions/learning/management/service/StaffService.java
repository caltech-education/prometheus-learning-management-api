package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "staff", url = "${athena.default.url}")
public interface StaffService {
}
