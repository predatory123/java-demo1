package com.qa.xuexiaoxiao.seventeen.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * 时间和日期的格式化操作
 *
 * @author: wenyongjie
 * @date: 2021/6/30 22:56
 */
public class DateTimeFormatCase {
    public static void main(String[] args) {
        // 格式化LocalDateTime对象
        LocalDateTime neueTime = LocalDateTime.now();
        System.out.println(neueTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(neueTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(neueTime.format(DateTimeFormatter.ofPattern("yy")));
        System.out.println(neueTime.format(DateTimeFormatter.ofPattern("'Jahr: 'yy', Monat: 'MM', Tag: 'dd")));

        // 使用辅助类实现
        DateTimeFormatter formatterei = new DateTimeFormatterBuilder().appendLiteral("Jahr: ").
                appendLiteral("yy").appendLiteral(", Monat: ").appendLiteral("MM").appendLiteral(", Tag: ").
                appendLiteral("dd").toFormatter();
        System.out.println(neueTime.format(formatterei));
    }
}
