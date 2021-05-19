package XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.src.de.galileocomputing.schroedinger.java.kapitel14.terminkalender.lesen;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.resources.kapitel14.de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Besitzer;
import XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.resources.kapitel14.de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Termin;
import XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.resources.kapitel14.de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Termine;
import XueXiaoXiaoStudyJava.src.Quelltext.SchroedingerProgrammiertJava.resources.kapitel14.de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Terminkalender;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class JAXB {
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File("resources/kapitel14/terminkalender3.xml"))) {
			JAXBContext jaxbContext = JAXBContext.newInstance(Terminkalender.class, Termine.class, Termin.class, Besitzer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Terminkalender terminkalender = (Terminkalender) jaxbUnmarshaller.unmarshal(eingabe);
			System.out.println(terminkalender.getTermine().getName());
			System.out.println(terminkalender.getBesitzer().getName());
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}
	}
}
