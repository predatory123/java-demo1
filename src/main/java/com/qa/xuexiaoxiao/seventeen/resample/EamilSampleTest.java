package com.qa.xuexiaoxiao.seventeen.resample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: wenyongjie
 * @date: 2021/7/4 17:37
 */
public class EamilSampleTest {
    public static final String EAMIL_MUSTER_STATIC = "^([a-z0-9_\\.\\-]+)@([a-z0-9_\\.\\-]+)\\.([a-z\\.]{2,6})$";
    private static Pattern EMAIL_MUSTER = Pattern.compile(EAMIL_MUSTER_STATIC);

    public static EmailSample erstelleEamilAdress(String enigabe) {
        EmailSample emailSample = null;
        Matcher matcher = EMAIL_MUSTER.matcher(enigabe);
        if (matcher.matches()) {
            String nutzerName = matcher.group(1);
            String domain = matcher.group(2);
            String topLevelDomain = matcher.group(3);
            emailSample = new EmailSample(nutzerName, domain, topLevelDomain);
        }
        return emailSample;
    }

    public static void main(String[] args) {
        String email_goole = "sample123@gmial.com";
        erstelleEamilAdress(email_goole);
//        System.out.println(erstelleEamilAdress(email_goole).toString());
    }

}
