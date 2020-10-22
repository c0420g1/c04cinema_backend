package com.example.demo.c04cinema.common;

import java.time.LocalDateTime;
import java.util.Date;

public class DateTime {
    public static LocalDateTime ConvertToLocalDateTime(Date val){
        return new java.sql.Timestamp(val.getTime()).toLocalDateTime();
    }
}
