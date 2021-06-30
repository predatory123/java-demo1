package com.qa.xuexiaoxiao.seventeen.locale;

import com.qa.xuexiaoxiao.seventeen.locale.Getreank;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 创建三个类，Bier、Wein和一个通用父类Getraenk。
 * <p>变量lieblingsgetraenk对应法国分配到一个Wein(葡萄酒)类实例，
 * 对应德国则分配到一个Bier(啤酒)类实例。
 * 完善下面代码
 *
 * @author: wenyongjie
 * @date: 2021/6/29 22:13
 */

public class WeinOrderBier {
    public static void main(String[] args) {
//        ResourceBundle getraenkeBundle = ;
//        Getreank lieblingsgetraenk = (Getreank) getraenkeBundle. ;
//        System.out.println(lieblingsgetraenk.getClass().getSimpleName());

        ResourceBundle getraenkeBundle = ResourceBundle.
                getBundle("com.qa.xuexiaoxiao.seventeen.GetraenkBundle", Locale.FRANCE) ;
        Getreank lieblingsgetraenk = (Getreank) getraenkeBundle.getObject("lieblingsgetraenk");
        System.out.println(lieblingsgetraenk.getClass().getSimpleName());
    }
}
