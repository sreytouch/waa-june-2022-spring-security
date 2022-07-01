package com.example.waajune2002springsecurity.aspect;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class CountWords {
    private static final Integer count = 0;
    private static final LocalDateTime lastRequest = null;

    private static Integer DURATION_TO_WAIT = 15;

    public static long timeToWait() {
        Duration duration = Duration.between(lastRequest, LocalDateTime.now());
        if (duration.toMinutes() < 15) {
            return DURATION_TO_WAIT - duration.toMinutes();
        }
        return 0;
    }
}
