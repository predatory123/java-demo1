package sample.book.demo.kapitel08.arrays;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class ArrayIteration {
	public static void main(String[] args) {
		String[] woche = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
		for (int i = 0; i < woche.length; i++) {
			System.out.println((i+1) + ". " + woche[i]);
		}
	}
}
