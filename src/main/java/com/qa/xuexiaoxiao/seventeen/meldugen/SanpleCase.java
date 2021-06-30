package com.qa.xuexiaoxiao.seventeen.meldugen;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author: wenyongjie
 * @date: 2021/6/28 22:51
 *
 * 创建三个不同的属性配置文件，输出不同的提示信息
 */
public class SanpleCase {
    public static void main(String[] args) {

        System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("gruss"));
        System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("ausgabe"));
        System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("text"));

        System.out.println(ResourceBundle.getBundle("meldungen", Locale.US).getString("gruss"));
        System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("gruss"));
        System.out.println(ResourceBundle.getBundle("meldungen", Locale.CANADA).getString("gruss"));
        System.out.println(ResourceBundle.getBundle("meldungen", Locale.ENGLISH).getString("gruss"));
    }
}
