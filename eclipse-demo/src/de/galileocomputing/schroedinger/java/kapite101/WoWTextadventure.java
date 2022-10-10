package de.galileocomputing.schroedinger.java.kapite101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/** javaÎÄ×ÖÓÎÏ· */
public class WoWTextadventure {
	public static void main(String[] args) throws IOException  {
		System.out.println("Hello" //+ args[0] + ", willkommen in der World of Warcraft."
				+ " Du befindest dich in Dorf Buxelknuxel.");
		System.out.println("Verwende die Tasten 'N','O','S' and 'W', um dich zu bewegen,"
				+ "und 'I', um einge Blick in dein Inventer zu werfen. ");
		System.out.println("Mit 'Q' verliasst du das Spiel.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befehl;
		while((befehl = br.readLine()) != null) {
			switch (befehl.toLowerCase()){
			case "n":
				System.out.println("Do gehst nach Norden");
				break;
			case "o":
				System.out.println("Do gehst nach Osten");
				break;
			case "s":
				System.out.println("Do gehst nach Suden");
				break;
//			}
			case "w":
				System.out.println("Do gehst nach Westen");
				break;
			case "q":
				System.out.println("Willst du wirklich schon ahfgeben? Y/N");
				String bestaetigung = br.readLine();
				switch ((bestaetigung.toLowerCase())) {
				case "y":
					System.out.println("Und Tsechuss.");
					System.exit(0);
					break;
				case "n":
					System.out.println("Finde ich prima.");
					break;
				}
				break;
			case "":
				System.out.println("Do willst gar nichts machen? Das glaude ich nicht.");
				break;
			case "i":
				System.out.println("Do you noch nicht die Weisheit der Array-kundigen einziger Gegenstand:"
						+ "ein Holzschwert.");
				break;
			default:
				System.err.println("Das verstehe ich nicht.");			
			}
		}
		
	}

}
