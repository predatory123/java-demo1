package com.qa.xuexiaoxiao.seventeen.locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/**
 * Locale对象用于不同的货币、时间和日期
 *
 * @author: wenyongjie
 * @date: 2021/6/29 22:30
 */
public class CurrencySample {
    public static void main(String[] args) throws Exception {
        // 针对货币
        Currency waehrung = Currency.getInstance(Locale.CHINA);
        System.out.println(waehrung.getCurrencyCode());
        System.out.println(waehrung.getDisplayName());
        System.out.println(waehrung.getSymbol());
        // 改变Locale之后，货币也会改变，需要进行格式化输出
        NumberFormat weahrungFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(weahrungFormat.format(24.0));

        // 针对数字
        NumberFormat zahlenFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat prozentFormat = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        System.out.println(zahlenFormat.format(24.0));
        System.out.println(prozentFormat.format(24.0));

        // 针对日期
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.CHINA);
        System.out.println(dateFormat.format(new Date()));

        // 针对时间
        DateFormat zeitFomat = DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.CHINA);
        System.out.println(zeitFomat.format(new Date()));
    }

}
