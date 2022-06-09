package com.example.batch.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("TestServiceImpl2")
public class TestServiceImpl2 implements TestService {
    @Override
    public void test() {
        System.out.println("Test Service impl 2");
    }
}
