package com.example.batch.rest;

import com.example.batch.service.TestService;
import lombok.AllArgsConstructor;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1")
@AllArgsConstructor
public class TestController {
    @Qualifier("TestServiceImpl")
    private final TestService testService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        MDC.put("Test","Am");
        System.out.println("Method Called : " + Thread.currentThread().getName());
        testService.test();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
