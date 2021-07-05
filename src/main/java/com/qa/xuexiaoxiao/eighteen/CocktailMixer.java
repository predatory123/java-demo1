package com.qa.xuexiaoxiao.eighteen;

/**
 * 接口测试
 *
 * @author: wenyongjie
 * @date: 2021/7/4 18:06
 */
public interface CocktailMixer {
    void hinzufuegen(Zutat zutat);
    Cocktail mixen() throws EkligeZutatenKombinationException;
    int getAnzahlZutaten();

    void entfernen(Milch milch);
}
