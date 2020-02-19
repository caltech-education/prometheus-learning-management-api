package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "flashCard", url = "${athena.default.url}")
public interface FlashCardService {
}
