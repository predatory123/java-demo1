package com.qa.xuexiaoxiao.seventeen;

import java.util.Locale;

/**
 * @Author: wenyongjie
 * @Date: 2021/6/28 21:38
 * 区分国家和地区示例
 */
public class FirstCase {
    public static void main(String[] args) {
        // 获取用户的设置信息
        Locale locale = Locale.getDefault();
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale.toString());

        // 更改默认设置
        Locale deutsch = new Locale("de");
        Locale deutschland = new Locale("de", "DE");
        Locale franzoesisch = new Locale.Builder().setLanguage("fr").build();
        Locale ialienisch = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
        Locale itlien = Locale.ITALY;
        Locale spanisch = Locale.forLanguageTag("es");
        Locale spanien = Locale.forLanguageTag("es-ES");

        Locale chia = new Locale("zh","CN");

        System.out.println(deutsch.getDisplayLanguage());
        System.out.println(franzoesisch.getDisplayLanguage());
        System.out.println(deutschland.getDisplayCountry());
        System.out.println(franzoesisch.getDisplayCountry());

        System.out.println(chia.getDisplayLanguage());
        System.out.println(chia.getDisplayCountry());
    }
}
