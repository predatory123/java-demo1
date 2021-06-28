package com.qa.xuexiaoxiao.sixteen;

import javafx.scene.control.TextField;

/**
 * 1.创建一个只允许输入数字的文本框
 */
public class ZahlenTextFeld extends TextField {
    @Override
    public void replaceText(int start, int end, String text) {
        if (this.inZahl(text)) {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text) {
        if (this.inZahl(text)) {
            super.replaceSelection(text);
        }
    }

    private boolean inZahl(String text) {
        return text.matches("[0-9]*");
    }


}
