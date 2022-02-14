/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTest {
//    2022  2  14
//    1900  1  13
//     122  1  13

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now().minusDays(10).minusMonths(1).minusYears(1999);

//        y-m-d
        System.out.println(dateTime.getDayOfMonth() + "-" +
                dateTime.getMonthValue() + "-" +
                dateTime.getYear());
        System.out.println(dateTime.getHour() + ":" +
                dateTime.getMinute() + ":" +
                dateTime.getSecond());
    }
}
