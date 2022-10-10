package sample.book.demo.kapitel07.musik.abspielgeraete;

import sample.book.demo.kapitel07.musik.tontraeger.CD;
import sample.book.demo.kapitel07.musik.tontraeger.Kassette;
import sample.book.demo.kapitel07.musik.tontraeger.LP;
import sample.book.demo.kapitel07.musik.tontraeger.MP3;
import sample.book.demo.kapitel07.musik.tontraeger.Schallplatte;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Probehoeren {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SchallplattenSpieler schallplattenSpieler = new SchallplattenSpieler();
		schallplattenSpieler.hoeren(new LP("Jimi Hendrix"));
		Schallplatte schallplatte = schallplattenSpieler.auswerfen();
		
		MusikAbspielGeraet cdPlayer = new CDPlayer();
		cdPlayer.hoeren(new LP("Jimi Hendrix")); // hier gibt's einen Fehler
		cdPlayer.hoeren(new CD("Jimi Hendrix"));
		
		MusikAbspielGeraet mp3Player = new MP3Player();
		mp3Player.hoeren(new MP3("Jimi Hendrix"));
		
		MusikAbspielGeraet kassettenRekorder = new KassettenRekorder();
		kassettenRekorder.hoeren(new Kassette("Jimi Hendrix"));
	}
}
