public class Garderoba extends Proizvod {
	private String materijaProizvoda;
	private String sezona;

	public Garderoba(String opisProizvoda, String barKod, String zemljaPorijekla, int godinaProizvodnje,
			double uvoznaCijena, String materijaProizvoda, String sezona) {
		super(opisProizvoda, barKod, zemljaPorijekla, godinaProizvodnje, uvoznaCijena);
		this.materijaProizvoda = materijaProizvoda;
		this.sezona = sezona;
	}

	public String getMaterijaProizvoda() {
		return materijaProizvoda;
	}
	public void setMaterijaProizvoda(String materijaProizvoda) {
		this.materijaProizvoda = materijaProizvoda;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}

	@Override
	public void izracunajCijenu() {
		this.uvoznaCijena = this.getUvoznaCijena() * 1.05;
	}
}