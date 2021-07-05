package com.qa.xuexiaoxiao.seventeen.datetime;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <p>格式化练习</p>
 * 1.编写一个程序，输出1到2000的数字，并且输出结果要分为20行，
 * 还要在个位数、十位数和百位数用0填充
 *
 * 2.给出了一个 musiksammlung.properties 配置文件，请说明源代码是如何加载消息的，一级占位符是如何被替换的
 * @author: wenyongjie
 * @date: 2021/7/4 16:04
 */
public class FormatTest {
    public static void main(String[] args) {
//        numberCase();
        musiksammlungCase();
    }

    public static void numberCase() {
        for (int i = 1; i <= 2000; i++) {
            System.out.print(String.format("%04d ", i));
            if (i%100 == 0) {
                System.out.println();
            }
        }
    }

    public static void musiksammlungCase() {
        Locale locale = Locale.getDefault();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("musiksammlung", locale);
        String ergebnismeldung = resourceBundle.getString("musiksammlungstatus");
        MessageFormat messageFormat = new MessageFormat(ergebnismeldung, locale);
        String meldung = messageFormat.format(new Object[]{20, "Jimi Hendrix", 200});
        System.out.println(meldung);
    }
}
