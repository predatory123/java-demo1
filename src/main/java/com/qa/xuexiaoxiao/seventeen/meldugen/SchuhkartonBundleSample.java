package com.qa.xuexiaoxiao.seventeen.meldugen;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author: wenyongjie
 * @date: 2021/6/29 22:05
 */
public class SchuhkartonBundleSample {
    public static void main(String[] args) {
        ResourceBundle schuhkartonBundle = ResourceBundle.getBundle("com.qa.xuexiaoxiao.seventeen.SchuhkartonBundle",
                new Locale("de", "DE"));
        System.out.println(schuhkartonBundle.getObject("hoehe"));
        System.out.println(schuhkartonBundle.getObject("tiefe"));
        System.out.println(schuhkartonBundle.getObject("breite"));
    }
}
