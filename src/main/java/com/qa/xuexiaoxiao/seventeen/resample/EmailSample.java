package com.qa.xuexiaoxiao.seventeen.resample;

/**
 * 匹配电子邮件
 *
 * @author: wenyongjie
 * @date: 2021/7/4 17:30
 */
public class EmailSample {
    private String nutzerName;
    private String domain;
    private String topLevelDomin;

    public EmailSample(String nutzerName, String domain, String topLevelDomin) {
        super();
        this.nutzerName = nutzerName;
        this.domain = domain;
        this.topLevelDomin = topLevelDomin;
    }

    public String getNutzerName() {
        return nutzerName;
    }

    public void setNutzerName(String nutzerName) {
        this.nutzerName = nutzerName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTopLevelDomin() {
        return topLevelDomin;
    }

    public void setTopLevelDomin(String topLevelDomin) {
        this.topLevelDomin = topLevelDomin;
    }
}
