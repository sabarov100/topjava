package ru.javawebinar.topjava.util;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeUtil {
    public static boolean isBetweenHalfOpen(LocalDateTime lt, LocalDateTime startTime, LocalDateTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) < 0;
    }
}
