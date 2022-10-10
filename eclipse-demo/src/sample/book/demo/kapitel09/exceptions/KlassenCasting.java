package sample.book.demo.kapitel09.exceptions;

import sample.book.demo.kapitel06.musikgruppe.refactoring.Musiker;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Saenger;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Trompeter;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class KlassenCasting {
	public static void main(String[] args) {
		nichtGut();
		besser();
	}

	private static void nichtGut() {
		Musiker musiker = new Trompeter("Joe Da Trompeta", "D.", "Joe");
		try {
			Saenger saenger = (Saenger) musiker;
			saenger.singen();
		} catch(ClassCastException exception) {
			System.err.println("Musiker ist wohl doch kein Sänger");
		}
	}
	
	private static void besser() {
		Musiker musiker = new Trompeter("Joe Da Trompeta", "D.", "Joe");
		if(musiker instanceof Saenger) {
			Saenger saenger = (Saenger) musiker;
			saenger.singen();
		}
	}
}
