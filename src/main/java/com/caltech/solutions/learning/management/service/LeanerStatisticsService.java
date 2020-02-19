package com.caltech.solutions.learning.management.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "leanerStatistics", url = "${athena.default.url}")
public interface LeanerStatisticsService {
}
