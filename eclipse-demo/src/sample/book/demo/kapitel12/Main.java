package sample.book.demo.kapitel12;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		new MachWas().start();
		(new Thread(new MachAuchWas())).start();
	}
}
