package com.qa.xuexiaoxiao.seventeen.datetime;

import sun.util.resources.LocaleData;

import java.time.*;
import java.util.Date;
import java.util.Locale;

/**
 * 1.新版时间api: localdate、localtime、localdatetime
 * 2.时区和时差
 *
 * @author: wenyongjie
 * @date: 2021/6/30 22:21
 */
public class NewTimeApiCaseTwo {
    public static void main(String[] args) {
        localDate();
        localTime();
        localDateTime();
        period();
        timeZoneDifference();
    }

    public static void localDate() {
        // LocalDate 示例
        LocalDate neuesDatum = LocalDate.now(); // 获取当前日期
        System.out.println(neuesDatum);
        System.out.println(neuesDatum.getYear());
        System.out.println(neuesDatum.getMonth());
        System.out.println(neuesDatum.getDayOfYear());
        System.out.println(neuesDatum.getDayOfMonth());
        System.out.println(neuesDatum.getDayOfWeek());
    }

    public static void localTime() {
        // LocalTime 示例
        LocalTime neueZeit = LocalTime.now();   // 获取当前时间
        System.out.println(neueZeit);
        System.out.println(neueZeit.getHour());
        System.out.println(neueZeit.getMinute());
        System.out.println(neueZeit.getSecond());
        System.out.println(neueZeit.getNano());
    }

    public static void localDateTime() {
        // LocalDateTime 示例
        LocalDateTime testDt = LocalDateTime.now(); // 获取当前日期和时间
        System.out.println(testDt);
    }

    public static void period() {
        // Period 示例
        Period duration = Period.of(2, 4, 6);   // 创建一个以天为单位且和开始、结束日期没有关系的时间段
        LocalDate datel1 = LocalDate.of(2021, 6 ,30);
        LocalDate datel2 = LocalDate.of(2021, 7 ,11);   // 得到一个时间段
        Period olyPer2021 = Period.between(datel1, datel2);
        System.out.println(olyPer2021.getDays());
    }

    public static void timeZoneDifference() {
        // 时区和时差
        System.out.println(ZoneId.systemDefault());
        OffsetDateTime offsetDateTime = OffsetDateTime.now();   // 创建一个没有时间说明的日期
        System.out.println(offsetDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();  // 输出一个有时间说明的日期
        System.out.println(zonedDateTime);

        ZoneId zoneId = ZoneId.of("Australia/Sydney"); // 生成一个时区
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zoneId); // 得到指定时区中的一个带时间的当前日期
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime1.getOffset()); // 时区
    }
}
