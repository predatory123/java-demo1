package com.qa.xuexiaoxiao.sixteen;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1.画一个计算鞋盒容器的计算器
 * 2.添加输入事件监控，对输入值判断
 * 3.需要显示单位
 * 4.需要定义输入数字的界限
 */

public class SamlpleShous extends JFrame {
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
    private JSlider esHoehe;
    private JSlider esBreite;
    private JSlider esTiefe;
    NurzhlenVerifier nurzhlenVerifier = new NurzhlenVerifier();
    BerechneErgebnisListener berechneErgebnisListener = new BerechneErgebnisListener();

    // 构造函数，定义基本属性
    public SamlpleShous() {
        super("VolumentBerechnerGui");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,200);
        this.initialisiereKomponenten();
        this.ordneKomponentenAn();

//        // 表单
//        this.registriereListener();
//        this.registriereValidatoren();
//        // 滑块
//        this.initialisierKomponenten();
//        this.berechneErgebnisListener.stateChanged(new ChangeEvent(this));

        this.setVisible(true);
    }

    // 定义各个文本框组件
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

    // 定义表单组件属性的大小
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
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm"),c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelBreite, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textBreite, c);
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm"),c);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelTiefe, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textTiefe, c);
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm"),c);
        c.gridx = 0;

        c.gridy = 3;
        c.gridwidth = 1;
        this.getContentPane().add(this.labelErgebnis, c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.getContentPane().add(this.textErgebnis, c);
        c.gridx = 3;
        c.gridwidth = 1;
        this.getContentPane().add(new JLabel("cm²"),c);
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
                // 解析数字
//                Integer hoehe = Integer.parseInt(textHoehe.getText());
//                Integer breite = Integer.parseInt(textBreite.getText());
//                Integer tiefe = Integer.parseInt(textTiefe.getText());
//                Integer ergebnis = hoehe * breite *tiefe;
//                textErgebnis.setText(ergebnis.toString());

                // 新方案
                int hoehe = esHoehe.getValue();
                int breite = esBreite.getValue();
                int tiefe = esTiefe.getValue();
                int ergebnis = hoehe * breite * tiefe;
                textErgebnis.setText(String.valueOf(ergebnis));
            }
        });

        this.esHoehe.addChangeListener(this.berechneErgebnisListener);
        this.esBreite.addChangeListener(this.berechneErgebnisListener);
        this.esTiefe.addChangeListener(this.berechneErgebnisListener);
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

    // 监控输入框信息——注册验证器
    private void registriereValidatoren() {
        this.textHoehe.setInputVerifier(this.nurzhlenVerifier);
        this.textBreite.setInputVerifier(this.nurzhlenVerifier);
        this.textTiefe.setInputVerifier(this.nurzhlenVerifier);
    }

    // 定义滑块属性
    private void initialisierKomponenten() {
        this.esHoehe = this.erstelleSchieberagler(20,60);
        this.esBreite = this.erstelleSchieberagler(20,60);
        this.esTiefe = this.erstelleSchieberagler(40,100);
    }

    // 设置滑块的最大和最小值
    private JSlider erstelleSchieberagler(int minimum, int maximum) {
        JSlider schieberegler = new JSlider(minimum, maximum);
        schieberegler.setPaintLabels(true);
        schieberegler.setPaintTicks(true);
        schieberegler.setMinorTickSpacing(5);
        schieberegler.setMajorTickSpacing(10);
        return schieberegler;
    }

    /**
     *  改变事件监听器
     *
     */
    private class BerechneErgebnisListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            aktualisiereErgebnis();
        }
    }

    // 滑块动作注册器
    private void aktualisiereErgebnis() {
        int hoehe = this.esHoehe.getValue();
        int breite = this.esBreite.getValue();
        int tiefe = this.esTiefe.getValue();
        int ergebnis = hoehe * breite * tiefe;
        this.textErgebnis.setText(String.valueOf(ergebnis));
    }

    public static void main(String[] args) {
        SamlpleShous ca = new SamlpleShous();
        ca.initialisiereKomponenten();




    }
}
