package com.qa.xuexiaoxiao.seventeen.datetime;

/**
 * 字符串的格式化
 *
 * @author: wenyongjie
 * @date: 2021/6/30 23:09
 */
public class StringFormat {
    public static void main(String[] args) {
        // %s代表一个占位符， %d代表一个十进制预留
        System.out.println(String.format("Hello %s und viel Spab mit Kapitel %d", "Schrodinger", 17));

        // 数字前面用0填充
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%02d", i));   // 中间的2代表位数
        }
    }
}
