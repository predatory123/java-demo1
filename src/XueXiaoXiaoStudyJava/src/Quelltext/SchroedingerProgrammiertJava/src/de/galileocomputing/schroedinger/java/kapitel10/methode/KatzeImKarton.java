package XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.src.de.galileocomputing.schroedinger.java.kapitel10.methode;

import de.galileocomputing.schroedinger.java.kapitel10.kartons.Karton;
import XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.src.de.galileocomputing.schroedinger.java.kapitel10.tierkoerbe.Katze;
import XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.src.de.galileocomputing.schroedinger.java.kapitel10.tierkoerbe.Tier;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class KatzeImKarton {
	
	public static void main(String[] args) {
		KatzeImKarton.<Tier>machWas(new Karton<Katze>(new Katze()));
	}
	
	public static <T> void machWas(Karton<? extends T> karton) {
		
	}
}
