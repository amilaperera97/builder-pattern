package com.example.batch.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("TestServiceImpl")
@Primary
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("Test Service impl 1 : " + Thread.currentThread().getName());
    }
}
