public class Zaposleni {
	private int id;
	private String ime;
	private String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;

	public Zaposleni(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
	}

	public double izracunajPlatu() {
		return 4 * ukupanBrojSati * plataPoSatu;
	}

	public String getTip() {
		return "Zaposleni";
	}

	public String getNapomena() {
		return "-";
	}

	@Override
	public String toString() {
		return id + " " + ime + " " + prezime + " (" + getTip() + ")";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getPlataPoSatu() {
		return plataPoSatu;
	}
	public void setPlataPoSatu(double plataPoSatu) {
		if (plataPoSatu > 0)
			this.plataPoSatu = plataPoSatu;
	}
	public double getUkupanBrojSati() {
		return ukupanBrojSati;
	}
	public void setUkupanBrojSati(double ukupanBrojSati) {
		if (ukupanBrojSati >= 0)
			this.ukupanBrojSati = ukupanBrojSati;
	}
}