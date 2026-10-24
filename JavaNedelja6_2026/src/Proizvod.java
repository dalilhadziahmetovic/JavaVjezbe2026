public abstract class Proizvod {
	String opisProizvoda;
	String barKod;
	String zemljaPorijekla;
	int godinaProizvodnje;
	protected double uvoznaCijena;

	public Proizvod(String opisProizvoda, String barKod, String zemljaPorijekla, int godinaProizvodnje,
			double uvoznaCijena) {
		this.opisProizvoda = opisProizvoda;
		this.barKod = barKod;
		this.zemljaPorijekla = zemljaPorijekla;
		this.godinaProizvodnje = godinaProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}

	public abstract void izracunajCijenu();

	@Override
	public String toString() {
		return opisProizvoda + " | bar kod: " + barKod + " | zemlja: " + zemljaPorijekla
				+ " | godina: " + godinaProizvodnje + " | cijena: " + String.format("%.2f", uvoznaCijena);
	}

	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public String getBarKod() {
		return barKod;
	}
	public void setBarKod(String barKod) {
		this.barKod = barKod;
	}
	public String getZemljaPorijekla() {
		return zemljaPorijekla;
	}
	public void setZemljaPorijekla(String zemljaPorijekla) {
		this.zemljaPorijekla = zemljaPorijekla;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setUvoznaCijena(double d) {
		this.uvoznaCijena = d;
	}
}