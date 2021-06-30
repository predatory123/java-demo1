package com.qa.xuexiaoxiao.seventeen.meldugen;

import com.qa.xuexiaoxiao.seventeen.locale.Bier;

import java.util.ListResourceBundle;

/**
 * @author: wenyongjie
 * @date: 2021/6/29 22:21
 */
public class GetraenkBundle_de_DE extends ListResourceBundle {
    public Object[][] inhalt = {
            {"lieblingsgetraenk", new Bier()},
    };

    @Override
    protected Object[][] getContents() {
        return inhalt;
    }
}
