package com.qa.xuexiaoxiao.sixteen;

import javax.swing.*;
import java.awt.*;

/**
 * 画一个登录页面
 */
public class LoginPage {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("LoginPage");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(290,170);
        fenster.setLayout(new GridBagLayout());

        JLabel labelName = new JLabel("Name");
        JLabel labelPassword = new JLabel("Password");
        JTextField feldName = new JTextField();
        JTextField feldPassword = new JPasswordField();
        JButton sfcOk = new JButton("Ok");
        JButton sfcAbbrenchen = new JButton("Abbrechen");

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4,4,4,4);
        c.gridx = 0;
        c.gridy = 0;
        fenster.getContentPane().add(labelName, c);
        c.gridx = 1;
        c.gridwidth = 2;
        fenster.getContentPane().add(feldName, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        fenster.getContentPane().add(labelPassword, c);
        c.gridx = 1;
        c.gridwidth = 2;
        fenster.getContentPane().add(feldPassword, c);
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        fenster.getContentPane().add(sfcOk, c);
        c.gridx = 2;
        c.gridy = 2;
        fenster.getContentPane().add(sfcAbbrenchen, c);
        fenster.setVisible(true);









        fenster.setVisible(true);

    }
}
