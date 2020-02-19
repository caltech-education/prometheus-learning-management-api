package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "leaner", url = "${athena.default.url}")
public interface LeanerService {
}
