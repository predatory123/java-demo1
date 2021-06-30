package com.qa.xuexiaoxiao.seventeen.meldugen;

import com.qa.xuexiaoxiao.seventeen.locale.Wein;

import java.util.ListResourceBundle;

/**
 * @author: wenyongjie
 * @date: 2021/6/29 22:21
 */
public class GetraenkBundle_fr_FR extends ListResourceBundle {
    public Object[][] inhalt = {
            {"lieblingsgetraenk", new Wein()},
    };

    @Override
    protected Object[][] getContents() {
        return inhalt;
    }
}
