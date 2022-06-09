package com.example.batch.config;

import org.slf4j.MDC;
import org.springframework.core.task.TaskDecorator;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class AsyncDecorator implements TaskDecorator {
    @Override
    public Runnable decorate(@NotNull Runnable runnable) {
        Map<String, String> contextMap = MDC.getCopyOfContextMap();
        return () -> {
            try {
                MDC.setContextMap(contextMap);
                runnable.run();
            } finally {
                MDC.clear();
            }
        };
    }
}
