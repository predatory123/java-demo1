package com.qa.xuexiaoxiao.sixteen;

import javax.swing.*;
import java.awt.*;

/**
 *  JFrame创建一个按钮
 */

public class GuiSample {
    public static void main(String[] args) {
        // 设置窗口标题
        JFrame fenster = new JFrame("Sample test");
        // 定义用户关闭当前窗口的行为
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 定义窗口的宽高
        fenster.setSize(240,80);

        // 定义一个按钮
        JButton schorr = new JButton("test button");
        Container fenscon = fenster.getContentPane();
        fenscon.add(schorr);

        // 设置窗口为可见
        fenster.setVisible(true);
    }
}
