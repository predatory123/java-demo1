package sample.book.demo.kapitel06.musikgruppe.wettbewerb;

import sample.book.demo.kapitel06.musikgruppe.refactoring.Musiker;
import sample.book.demo.kapitel06.musikgruppe.refactoring.Saenger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GesangsWettbewerb extends MusikWettbewerb {
	@Override
	public Saenger derGewinnerIst() {
		return null;
	}
	@Override
	public void fuegeTeilnehmerHinzu(Musiker musiker) {
	}
}
