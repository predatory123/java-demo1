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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sample.book.demo.kapitel14.musiksammlung.Konstanten;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class DOM {
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/musiksammlung.xml"))) {
			DocumentBuilderFactory fabrik = DocumentBuilderFactory.newInstance();
			fabrik.setNamespaceAware(true);
			DocumentBuilder documentBauer = fabrik.newDocumentBuilder();
			Document dokument = documentBauer.parse(eingabe);
			dokument.getDocumentElement().normalize();
			System.out.println("Musiksammlung");
			NodeList kuenstler = dokument.getElementsByTagName(Konstanten.ELEMENT_KUENSTLER);
			for (int i = 0; i < kuenstler.getLength(); i++) {
				Node knoten = kuenstler.item(i);
				if (knoten.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) knoten;
					Element name = (Element) element.getElementsByTagName(Konstanten.ELEMENT_KUENSTLER_NAME).item(0);
					System.out.println("Künstler : " + name.getTextContent());
					NodeList alben = element.getElementsByTagName(Konstanten.ELEMENT_ALBUM);
					for (int j = 0; j < alben.getLength(); j++) {
						Node album = alben.item(j);
						if (album.getNodeType() == Node.ELEMENT_NODE) {
							Element albumElement = (Element) album;
							System.out.println("Titel: " + albumElement.getAttribute(Konstanten.ATTRIBUT_ALBUM_TITEL));
							Element veroeffentlicht = (Element) albumElement.getElementsByTagName(Konstanten.ELEMENT_VEROEFFENTLICHT).item(0);
							System.out.println("Veröffentlicht: " + veroeffentlicht.getTextContent());
						}
					}
				}
			}
			System.out.println("Alben insgesamt: " + dokument.getElementsByTagName(Konstanten.ELEMENT_ALBUM).getLength());
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
