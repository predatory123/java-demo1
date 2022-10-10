package sample.book.demo.kapitel07.musik.abspielgeraete;

import sample.book.demo.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class AnalogesMusikAbspielGeraet extends MusikAbspielGeraet {
	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("Oh, " + tontraeger.getTitel() + ", und dann auch noch analog, das klingt gut!");
	}
}
