package com.qa.xuexiaoxiao.sixteen;

import javax.swing.*;
import java.awt.*;

/**
 *  画一个计算器
 */

public class TestCalculator {
    public static void main(String[] args) {
        JFrame fenster = new JFrame(" Test calculator");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(200,200);

        fenster.setLayout(new GridLayout(4,4));
        fenster.getContentPane().add(new JButton("7"));
        fenster.getContentPane().add(new JButton("8"));
        fenster.getContentPane().add(new JButton("9"));
        fenster.getContentPane().add(new JButton("/"));
        fenster.getContentPane().add(new JButton("4"));
        fenster.getContentPane().add(new JButton("5"));
        fenster.getContentPane().add(new JButton("6"));
        fenster.getContentPane().add(new JButton("*"));
        fenster.getContentPane().add(new JButton("1"));
        fenster.getContentPane().add(new JButton("2"));
        fenster.getContentPane().add(new JButton("3"));
        fenster.getContentPane().add(new JButton("-"));
        fenster.getContentPane().add(new JButton("0"));
        fenster.getContentPane().add(new JButton(","));
        fenster.getContentPane().add(new JButton("="));
        fenster.getContentPane().add(new JButton("+"));

        fenster.setVisible(true);

    }
}
