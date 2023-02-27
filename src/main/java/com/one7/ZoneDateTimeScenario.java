package com.one7;

import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeScenario {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Format====" + now.toLocalDate());
        System.out.println("Format====" + now.toLocalDateTime());
        System.out.println("Format====" + now.toLocalTime());
        System.out.println("Format====" + Timestamp.valueOf(now.toLocalDateTime()));
        System.out.println("Format====" + ZonedDateTime.now(ZoneOffset.UTC));

        String temp = "{ \"currentTime\": \"" + ZonedDateTime.now(ZoneOffset.UTC) + "\", \"status\": \"OK\"}";
        System.out.println(temp);
    }
}
