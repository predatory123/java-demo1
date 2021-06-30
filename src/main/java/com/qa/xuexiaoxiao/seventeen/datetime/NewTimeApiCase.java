package com.qa.xuexiaoxiao.seventeen.datetime;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.security.jca.GetInstance;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * 新版时间api
 *
 * @author: wenyongjie
 * @date: 2021/6/30 22:03
 */
public class NewTimeApiCase {
    public static void main(String[] args) {
        // 旧版时间api
        System.out.println("------------old-------");
        System.out.println(new Date(2021, 6, 30));
        Date datum = new Date();
        Instant instant = Instant.now();

        System.out.println(datum);
        System.out.println(instant);

        // 新版api
        System.out.println("-----------new-----------");
        System.out.println(new Date().getTime());   // 精确到毫秒
        System.out.println(Instant.now().getEpochSecond()); // 精确到秒、毫秒、纳秒
        System.out.println(Instant.now().getNano());

        System.out.println(Instant.EPOCH); // 显示起始元年
        System.out.println(Instant.MIN);    // 显示起始元年0之前的10亿年
        System.out.println(Instant.MAX);    // 显示起始元年0之后的10亿年

        // 用于便是一个时间段
        Duration zeitdauer = Duration.ofHours(4); // 一个4小时的时间段
        Instant zeitpunkt = Instant.now();
        Instant zeitpunkt2 = zeitpunkt.plus(zeitdauer);
        Duration zeitdauer2 = Duration.between(zeitpunkt, zeitpunkt2);
    }
}
