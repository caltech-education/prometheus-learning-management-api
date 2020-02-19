package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "quizAnswer", url = "${athena.default.url}")
public interface QuizAnswerService {
}
