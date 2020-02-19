package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "userAccess", url = "${athena.default.url}")
public interface UserAccessService {
}
