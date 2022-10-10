package sample.book.demo.kapitel12.synchronisierung;

import sample.book.demo.kapitel07.musik.abspielgeraete.MusikAbspielGeraet;
import sample.book.demo.kapitel07.musik.abspielgeraete.SchallplattenSpieler;
import sample.book.demo.kapitel07.musik.tontraeger.LP;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	
	public static void main(String[] args) {
		final MusikAbspielGeraet plattenSpieler = new SchallplattenSpieler();
		(new Thread(new Runnable() {
			@Override
			public void run() {
				plattenSpieler.hoeren(new LP("The Doors"));
			}
		}, "Hörer")).start();
		(new Thread(new Runnable() {
			@Override
			public void run() {
				plattenSpieler.auswerfen();
			}
		}, "Auswerfer")).start();
	}
}
