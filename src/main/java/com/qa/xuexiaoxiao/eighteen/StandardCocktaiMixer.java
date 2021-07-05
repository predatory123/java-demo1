package com.qa.xuexiaoxiao.eighteen;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: wenyongjie
 * @date: 2021/7/4 19:13
 */
public class StandardCocktaiMixer implements CocktailMixer {

    private Collection<Zutat> zutaten;

    public StandardCocktaiMixer() {
        this.zutaten = new ArrayList<>();
    }

    @Override
    public void hinzufuegen(Zutat zutat) {
        this.zutaten.add(zutat);
    }

    @Override
    public Cocktail mixen() throws EkligeZutatenKombinationException {
        if(enthaelt(this.zutaten, Banane.class) && enthaelt(this.zutaten, Apfelsaft.class)) {
            throw new EkligeZutatenKombinationException();
        }
        Collection<Zutat> zutaten = new ArrayList<>(this.zutaten);
        this.zutaten.clear();
        return new Cocktail(zutaten);
    }

    public static <T> boolean enthaelt(Collection<?> collection, Class<T> klasse) {
        for (Object o : collection) {
            if (o != null && o.getClass() == klasse) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return this.zutaten.size();
    }

    @Override
    public void entfernen(Milch milch) {

    }
}
