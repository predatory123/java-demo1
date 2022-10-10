package sample.book.demo.kapitel14.musiksammlung.lesen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sample.book.demo.kapitel14.musiksammlung.Konstanten;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class DOM1968 {
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/musiksammlung4.xml"))) {
			DocumentBuilderFactory fabrik = DocumentBuilderFactory.newInstance();
			fabrik.setNamespaceAware(true);
			DocumentBuilder documentBauer = fabrik.newDocumentBuilder();
			Document dokument = documentBauer.parse(eingabe);
			dokument.getDocumentElement().normalize();
			NodeList kuenstler = dokument.getElementsByTagName(Konstanten.ELEMENT_KUENSTLER);
			for (int i = 0; i < kuenstler.getLength(); i++) {
				Element kuenstlerElement  = (Element) kuenstler.item(i);
				Element name = (Element) kuenstlerElement .getElementsByTagName(Konstanten.ELEMENT_KUENSTLER_NAME).item(0);
				NodeList alben = kuenstlerElement .getElementsByTagName(Konstanten.ELEMENT_ALBUM);
				for (int j = 0; j < alben.getLength(); j++) {
					Element albumElement = (Element) alben.item(j);
					Element veroeffentlicht = (Element) albumElement.getElementsByTagName(Konstanten.ELEMENT_VEROEFFENTLICHT).item(0);
					if("1968".equals(veroeffentlicht.getTextContent())) {
						System.out.println("Künstler : " + name.getTextContent());
						System.out.println("Titel: " + albumElement.getAttribute(Konstanten.ATTRIBUT_ALBUM_TITEL));
						System.out.println("Veröffentlicht: " + veroeffentlicht.getTextContent());
					}
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
