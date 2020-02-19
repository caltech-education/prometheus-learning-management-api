package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "score", url = "${athena.default.url}")
public interface ScoreService {
}
