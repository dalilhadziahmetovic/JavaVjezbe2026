public class ObracunPlate {
	private int mjesec;
	private int godina;
	private Zaposleni zaposleni;
	private double iznos;
	private String napomena;

	public ObracunPlate(int mjesec, int godina, Zaposleni zaposleni, double iznos, String napomena) {
		this.mjesec = mjesec;
		this.godina = godina;
		this.zaposleni = zaposleni;
		this.iznos = iznos;
		this.napomena = napomena;
	}

	@Override
	public String toString() {
		return mjesec + "/" + godina + " - " + zaposleni.getIme() + " " + zaposleni.getPrezime() + ": "
				+ String.format("%.2f", iznos) + " EUR (" + napomena + ")";
	}

	public int getMjesec() {
		return mjesec;
	}
	public void setMjesec(int mjesec) {
		this.mjesec = mjesec;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		this.godina = godina;
	}
	public Zaposleni getZaposleni() {
		return zaposleni;
	}
	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	public String getNapomena() {
		return napomena;
	}
	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
}