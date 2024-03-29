package sample.book.demo.kapitel10.kartons.interfaces;

import sample.book.demo.kapitel10.kartons.SchuhPaar;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhKarton implements Behaelter<SchuhPaar> {

	private SchuhPaar inhalt;
	
	@Override
	public void setInhalt(SchuhPaar inhalt) {
		this.inhalt = inhalt;
	}
	
	@Override
	public SchuhPaar getInhalt() {
		return inhalt;
	}

}
