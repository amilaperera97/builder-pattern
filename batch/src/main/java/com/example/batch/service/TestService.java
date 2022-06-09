package com.example.batch.service;

import org.springframework.scheduling.annotation.Async;

public interface TestService {
    @Async("AsyncExecutor")
    void test();

}
