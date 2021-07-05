package com.qa.xuexiaoxiao.eighteen;

import com.sun.deploy.appcontext.AppContext;

/**
 * @author: wenyongjie
 * @date: 2021/7/4 18:08
 */
public class CocktailMixerImpl implements CocktailMixer {
    private AppContext zutaten;

    @Override
    public void hinzufuegen(Zutat zutat) {

    }

    @Override
    public Cocktail mixen() {
//        return null;
        return new Cocktail();
    }

    @Override
    public int getAnzahlZutaten() {
        return 0;
    }

    @Override
    public void entfernen(Milch milch) {

    }
}
