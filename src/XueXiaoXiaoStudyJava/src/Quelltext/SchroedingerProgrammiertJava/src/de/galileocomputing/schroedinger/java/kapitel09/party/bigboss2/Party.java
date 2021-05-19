package XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.src.de.galileocomputing.schroedinger.java.kapitel09.party.bigboss2;

/**
 * 
 * @author Philip Ackermann
 *
 */
public interface Party {
	
	void setLocation(Location location);
	
	void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException, BudeVollException;
}
