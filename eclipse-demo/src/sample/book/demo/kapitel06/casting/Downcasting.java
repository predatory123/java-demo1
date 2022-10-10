package sample.book.demo.kapitel06.casting;

import sample.book.demo.kapitel06.musikgruppe.refactoring.Kuenstler;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Musiker;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Person;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Saenger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Downcasting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person mick = new Saenger("Micky","Mick","Jagger");
		Kuenstler kurt = new Saenger("Kurt","Kurt","Cobain");
		Musiker paul = new Saenger("Paulie","Paul","Paul McCartney");
		Saenger bruce = new Saenger("The Boss","Bruce","Springsteen");
		Musiker mickDerMusiker = (Musiker) mick;
		mickDerMusiker.musizieren();
		((Musiker)mick).musizieren();
	}
}
