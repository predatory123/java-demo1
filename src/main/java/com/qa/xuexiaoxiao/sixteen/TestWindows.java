package com.qa.xuexiaoxiao.sixteen;

import javax.swing.*;
import java.awt.*;

/**
 *  JFrame创建一个label,并设置布局显示情况
 */

public class TestWindows {
    public static void main(String[] args) {
        // 设置窗口标题
        JFrame fenster = new JFrame("Sample test");
        // 定义用户关闭当前窗口的行为
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 定义窗口的宽高
        fenster.setSize(240,80);

        // 定义一个label
        JButton schorr = new JButton("test button");

        // 传统方案，不会全部显示
//        fenster.getContentPane().add(schorr);
//        JLabel label = new JLabel("hello java");
//        fenster.getContentPane().add(label);
//        Container fenscon = fenster.getContentPane();
//        fenscon.add(schorr);

        // 优化方案
        fenster.getContentPane().add(schorr,BorderLayout.WEST);
        JLabel label = new JLabel("hello java");
        fenster.getContentPane().add(label,BorderLayout.EAST);


        // 设置窗口为可见
        fenster.setVisible(true);
    }
}
