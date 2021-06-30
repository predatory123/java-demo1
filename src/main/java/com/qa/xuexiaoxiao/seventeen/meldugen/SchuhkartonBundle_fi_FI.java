package com.qa.xuexiaoxiao.seventeen.meldugen;

import java.util.ListResourceBundle;

/**
 * 不仅加载与地区有关的字符串，还加载任意与地区有关的对象
 *
 * @author: wenyongjie
 * @date: 2021/6/29 21:55
 */
public class SchuhkartonBundle_fi_FI extends ListResourceBundle {

    public Object[][] inhalt = {
        {"hoehe", Integer.valueOf(10)},
        {"tiefe", Integer.valueOf(50)},
        {"breite", Integer.valueOf(20)},
    };

    @Override
    protected Object[][] getContents() {
        return inhalt;
    }
}
