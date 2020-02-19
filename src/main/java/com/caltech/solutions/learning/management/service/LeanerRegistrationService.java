package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "leanerRegistration", url = "${athena.default.url}")
public interface LeanerRegistrationService {
}
