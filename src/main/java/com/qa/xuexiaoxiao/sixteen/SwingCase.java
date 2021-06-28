package com.qa.xuexiaoxiao.sixteen;

import javax.swing.*;

/**
 *  JFrame创建主窗口
 */

public class SwingCase {
    public static void main(String[] args) {
        // 设置窗口标题
        JFrame fenster = new JFrame("Sample test");
        // 定义用户关闭当前窗口的行为
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 定义窗口的宽高
        fenster.setSize(240,80);
        // 设置窗口为可见
        fenster.setVisible(true);
    }
}
