package sample.book.demo.kapitel12.zahlenspiele;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		int grenze = 1000000;
		(new Thread(new GeradeZahlenDrucker(grenze))).start();
		(new Thread(new UngeradeZahlenDrucker(grenze))).start();
	}
}
