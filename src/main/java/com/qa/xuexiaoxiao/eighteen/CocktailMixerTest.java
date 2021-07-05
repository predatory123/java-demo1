package com.qa.xuexiaoxiao.eighteen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author: wenyongjie
 * @date: 2021/7/4 18:11
 */
public class CocktailMixerTest {

    private CocktailMixer cocktailMixer;

    @Before
    public void setUp() {
        this.cocktailMixer = new StandardCocktaiMixer();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testeCocktailMixer() throws EkligeZutatenKombinationException {
        CocktailMixer cocktailMixer = new CocktailMixerImpl();
        Cocktail cocktail = cocktailMixer.mixen();
        assertNotNull(cocktail);

    }

    @Test
    public void testAnzahlZutatenInCocktail() {
        Banane banane = new Banane();
        Milch milch = new Milch();
        CocktailMixer cocktailMixer = new StandardCocktaiMixer();
        cocktailMixer.hinzufuegen(banane);
        cocktailMixer.hinzufuegen(milch);
        assertEquals(2, cocktailMixer.getAnzahlZutaten());
    }

    @Test
    public void testAnzahlZutatenInCocktailOne() throws EkligeZutatenKombinationException {
        Banane banane = new Banane();
        Milch milch = new Milch();
        this.cocktailMixer.hinzufuegen(banane);
        this.cocktailMixer.hinzufuegen(milch);
        assertEquals(2, this.cocktailMixer.getAnzahlZutaten());
        Cocktail cocktail = cocktailMixer.mixen();
        assertEquals(0, cocktailMixer.getAnzahlZutaten());
        assertEquals(2, cocktailMixer.getAnzahlZutaten());
    }

    @Test(expected = EkligeZutatenKombinationException.class)
    public void testEkligeZutatenKombination() throws EkligeZutatenKombinationException {
        Banane banane = new Banane();
        Apfelsaft apfelsaft = new Apfelsaft();
        CocktailMixer cocktailMixer = new StandardCocktaiMixer();
        cocktailMixer.hinzufuegen(banane);
        cocktailMixer.hinzufuegen(apfelsaft);
        Cocktail cocktail = cocktailMixer.mixen();
    }

    @Test
    public void testEntfernenVonZutaten() throws EkligeZutatenKombinationException {
        Banane banane = new Banane();
        Apfelsaft apfelsaft = new Apfelsaft();
        Milch milch = new Milch();
        this.cocktailMixer.hinzufuegen(banane);
        this.cocktailMixer.hinzufuegen(apfelsaft);
        this.cocktailMixer.hinzufuegen(milch);
        this.cocktailMixer.entfernen(milch);
        Cocktail cocktail = this.cocktailMixer.mixen();

    }

}
