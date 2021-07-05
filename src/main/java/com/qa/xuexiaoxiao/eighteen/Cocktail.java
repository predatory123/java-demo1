package com.qa.xuexiaoxiao.eighteen;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Collection;

/**
 * @author: wenyongjie
 * @date: 2021/7/4 18:09
 */
public class Cocktail {
    private Collection<Zutat> zutaten;
    public Cocktail(Collection<Zutat> zutaten) {
        this.zutaten = zutaten;
    }

    public Cocktail() {

    }

    public int getAnzahlZutaten() {
        return this.zutaten.size();
    }
}
