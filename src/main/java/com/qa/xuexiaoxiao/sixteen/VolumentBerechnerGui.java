package com.qa.xuexiaoxiao.sixteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1.画一个计算鞋盒容器的计算器
 * 2.添加输入事件监控，对输入值判断
 */

public class VolumentBerechnerGui extends JFrame {
    private JLabel labelHoehe;
    private JLabel labelBreite;
    private JLabel labelTiefe;
    private JLabel labelErgebnis;
    private JTextField textHoehe;
    private JTextField textBreite;
    private JTextField textTiefe;
    private JTextField textErgebnis;
    private JButton sfcBerechnen;
    private JButton sfcLeeren;
    NurzhlenVerifier nurzhlenVerifier = new NurzhlenVerifier();

    public VolumentBerechnerGui() {
        super("VolumentBerechnerGui");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,200);
        this.initialisiereKomponenten();
        this.ordneKomponentenAn();
        this.setVisible(true);
    }

    private void initialisiereKomponenten() {
        this.labelHoehe = new JLabel("Hohe:");
        this.labelBreite = new JLabel("Breite:");
        this.labelTiefe = new JLabel("Tiefe:");
        this.labelErgebnis = new JLabel("Ergebins:");
        this.textHoehe = new JTextField();
        this.textBreite = new JTextField();
        this.textTiefe = new JTextField();
        this.textErgebnis = new JTextField();
        this.sfcBerechnen  = new JButton("Berechnen:");
        this.sfcLeeren  = new JButton("Leeren:");
    }

    private void ordneKomponentenAn() {
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4,4,4,4);
        c.gridx = 0;
        c.gridy = 0;
        this.getContentPane().add(this.labelHoehe, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textHoehe, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelBreite, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textBreite, c);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelTiefe, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textTiefe, c);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelErgebnis, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textErgebnis, c);
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        this.getContentPane().add(this.sfcBerechnen, c);
        c.gridx = 2;
        this.getContentPane().add(this.sfcLeeren, c);

    }

    // 事件监控
    private void registriereListener() {
        this.sfcBerechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer hoehe = Integer.parseInt(textHoehe.getText());
                Integer breite = Integer.parseInt(textBreite.getText());
                Integer tiefe = Integer.parseInt(textTiefe.getText());
                Integer ergebnis = hoehe * breite *tiefe;
                textErgebnis.setText(ergebnis.toString());
            }
        });
    }

    // 输入信息监控
    private static class NurzhlenVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
           String text =((JTextField) input).getText();
           try {
               Integer.parseInt(text);
               return true;
           }catch (NumberFormatException e) {
               return false;
           }
        }
    }

    private void registriereValidatoren() {
        this.textHoehe.setInputVerifier(this.nurzhlenVerifier);
        this.textBreite.setInputVerifier(this.nurzhlenVerifier);
        this.textTiefe.setInputVerifier(this.nurzhlenVerifier);
    }

    public static void main(String[] args) {
        VolumentBerechnerGui ca = new VolumentBerechnerGui();
        ca.ordneKomponentenAn();
        ca.registriereValidatoren();
        ca.registriereListener();

    }
}
