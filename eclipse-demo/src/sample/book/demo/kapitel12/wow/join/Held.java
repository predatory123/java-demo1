package sample.book.demo.kapitel12.wow.join;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class Held {
	private String name;
	
	public Held(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void aufInDenKampf(Held held);
}
