package sample.book.demo.kapitel06.casting;

import sample.book.demo.kapitel06.musikgruppe.refactoring.Musiker;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Person;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Saenger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Upcasting {
	public static void main(String[] args) {
		Musiker mickDerMusiker = new Saenger("","","");
		Person mick = mickDerMusiker;
		berechneGehalt(mick);
	}
	
	public static void berechneGehalt(Person person) {
		System.out.println("Berechne Gehalt für normale Personen");
	}
	
	public static void berechneGehalt(Musiker musiker) {
		System.out.println("Berechne Gehalt für Musiker");
	}
}
