package com.qa.xuexiaoxiao.seventeen.locale;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 编写一个货币计算程序
 * <p>用于计算欧元和美元之间的换算，输入的货币单位为欧元，
 * 比如： 输入“27.00”就会输出“27.00€=$35.09”
 * 货币的汇率按1.2996计算
 *
 * @author: wenyongjie
 * @date: 2021/6/29 22:48
 */
public class CurreneyTestCase {
    private static final BigDecimal UMRECHNUNGS_FAKTOR = new BigDecimal(1.2996);
    private static final NumberFormat WAEHRUNGS_FORMAT_DEUTSCHLAND = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    private static final NumberFormat WAEHRUNGS_FORMAT_USA = NumberFormat.getCurrencyInstance(Locale.US);

    public static void main(String[] args) {
        double euro = 27.0;
        double dallar = euroZuUSDollar(new BigDecimal(euro)).doubleValue();
        String meldung = generiereMeldung(euro, dallar);
        System.out.println(meldung);
    }

    public static BigDecimal euroZuUSDollar(BigDecimal euro) {
        BigDecimal dollar = euro.multiply(UMRECHNUNGS_FAKTOR);
        dollar = dollar.setScale(4, RoundingMode.HALF_DOWN);
        return dollar;
    }

//    public static String generiereMeldung(double euro, double dollar) {
//        StringBuilder meldung = new StringBuilder();
//        meldung.append(WAEHRUNGS_FORMAT_DEUTSCHLAND.format(euro));
//        meldung.append(" = ");
//        meldung.append(WAEHRUNGS_FORMAT_USA.format(dollar));
//        return meldung.toString();
//    }

    /**调整代码，使其输出完整的句子，比如“Ergebnis:27.00€ sind $35.09 ”
     * 用英语输出则是 “Result:27.00€ are $35.09 ”
     */
//    private static String generiereMeldung(double euro, double dollar) {
//        Locale locale = Locale.getDefault();
//        ResourceBundle meldungen = ResourceBundle.getBundle("waehrungsrechner", locale);
//        StringBuilder meldung = new StringBuilder();
//        meldung.append(meldungen.getString("ergebnis"));
//        meldung.append("");
//        meldung.append(WAEHRUNGS_FORMAT_DEUTSCHLAND.format(euro));
//        meldung.append("");
//        meldung.append(meldungen.getString("sind"));
//        meldung.append("");
//        meldung.append(WAEHRUNGS_FORMAT_USA.format(dollar));
//        return meldung.toString();
//    }

    // 代码简化
    private static String generiereMeldung(double euro, double dollar) {
        Locale locale = Locale.getDefault();
        ResourceBundle meldungen = ResourceBundle.getBundle("waehrungsrechner", locale);
        String ergebnismeldung = meldungen.getString("ergebnismeldung");
        MessageFormat nachrichtenFormat = new MessageFormat(ergebnismeldung, locale);
        return nachrichtenFormat.format(new Object[]{
                WAEHRUNGS_FORMAT_DEUTSCHLAND.format(euro),
                WAEHRUNGS_FORMAT_USA.format(dollar)
        });
    }
}
