public class Konobar extends Zaposleni {
	private double prekovremeniSati;

	public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati,
			double prekovremeniSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.prekovremeniSati = prekovremeniSati;
	}

	public double getPrekovremeniSati() {
		return prekovremeniSati;
	}
	public void setPrekovremeniSati(double prekovremeniSati) {
		if (prekovremeniSati >= 0)
			this.prekovremeniSati = prekovremeniSati;
	}

	@Override
	public double izracunajPlatu() {
		double redovno = ukupanBrojSati * plataPoSatu;
		double prekovremeno = prekovremeniSati * plataPoSatu * 1.2;
		return 4 * (redovno + prekovremeno);
	}

	@Override
	public String getTip() {
		return "Konobar";
	}

	@Override
	public String getNapomena() {
		if (prekovremeniSati > 0) {
			return "prekovremeni: " + prekovremeniSati + "h";
		}
		return "-";
	}
}