package sample.book.demo.kapitel10.kartons.interfaces;

import sample.book.demo.kapitel10.kartons.SchuhPaar;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		SchuhKarton schuhKarton = new SchuhKarton();
		schuhKarton.setInhalt(new SchuhPaar(38, "Pink", true));
	}
}
