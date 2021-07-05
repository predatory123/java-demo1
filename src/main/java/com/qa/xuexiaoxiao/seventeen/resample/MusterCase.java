package com.qa.xuexiaoxiao.seventeen.resample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式应用
 *  "0123/123456"
 *  "..../......"  or "....?/......?"
 *  ".{4,5}/.{6,7}"
 *  "[0-9]{4,5}/[0-9]{6,7}"
 *  "\\d{4,5}/\\d{6,7}" or "0\\d{3,4}/\\d{6,7}"
 *  "0\\d{3,4}[/\\-\\s]?\\d{6,7}"  匹配减号、空格等
 *  "^0\\d{3,4}[/\\-\\s]?\\d{6,7}$"   查找一行的电话号码
 *
 * @author: wenyongjie
 * @date: 2021/7/4 16:31
 */
public class MusterCase {
    private static final Pattern TELEFONNUMMERN = Pattern.compile("0\\d{3,4}[/\\-\\s]?\\d{6,7}");   // 正则表达式
    private static final Pattern TELEFONNUMMERN_GROUP = Pattern.compile("^(0\\d{3,4})[/\\-\\s]?(\\d{6,7})$");

    public static void main(String[] args) {
//        System.out.println(istGueltigeTelefonnummer("0123/123456"));    // 需要检测的字符串
//
//        // 检测字符串
//        Matcher matcher = TELEFONNUMMERN.matcher("Kein Anschluss unter disere Number: 0123/123456 und " + "\n"
//               + "anch nicht unter 0234/223456");
//        System.out.println(matcher.find());
//        System.out.println(matcher.find());
//        System.out.println(matcher.find());
//        System.out.println(matcher.matches());

        String caseSos = "01236/123456";
        System.out.println(telefonnmmerEre(caseSos));
    }

    /**
     * 正则表达式基本使用
     * @param telefonnummer
     * @return true or false
     */
    public static boolean istGueltigeTelefonnummer(String telefonnummer) {
        Matcher matcher = TELEFONNUMMERN.matcher(telefonnummer);
        return matcher.matches();
    }

    public static Telefonnummer telefonnmmerEre(String telefonnmmer) {
        Matcher matcher = TELEFONNUMMERN_GROUP.matcher(telefonnmmer);
        matcher.matches();
        String vorwahl = matcher.group(1);
        String hauptnummer = matcher.group(2);
        return new Telefonnummer(vorwahl, hauptnummer);
    }

}
