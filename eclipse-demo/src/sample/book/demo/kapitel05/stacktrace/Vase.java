package sample.book.demo.kapitel05.stacktrace;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Vase {
	public void umfallen() {
		Thread.dumpStack();
	}
}
