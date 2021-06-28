package com.qa.xuexiaoxiao.seventeen;

import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author: wenyongjie
 * @date: 2021/6/28 21:55
 * 获取特定某个地区的准确值
 */
public class ResourceBundleSample {
    public static void main(String[] args) {
//        ResourceBundle meldungen =ResourceBundle.getBundle("meldungen", Locale.GERMAN);

        // 修改程序，輸出芬兰语格式
        Locale locale = Locale.forLanguageTag("fi");
        ResourceBundle meldungen =ResourceBundle.getBundle("meldungen", locale);

        System.out.println(meldungen.getString("titel"));
        System.out.println(meldungen.getString("hoehe"));
        System.out.println(meldungen.getString("tiefe"));
        System.out.println(meldungen.getString("breite"));
        System.out.println(meldungen.getString("ergebnis"));
    }
}
