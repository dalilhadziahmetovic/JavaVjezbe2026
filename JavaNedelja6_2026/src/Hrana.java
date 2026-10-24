import java.time.LocalDate;

public class Hrana extends Proizvod {
	private int kalorije;
	LocalDate danas = LocalDate.now();

	public Hrana(String opisProizvoda, String barKod, String zemljaPorijekla, int godinaProizvodnje,
			double uvoznaCijena, int kalorije, LocalDate danas) {
		super(opisProizvoda, barKod, zemljaPorijekla, godinaProizvodnje, uvoznaCijena);
		this.setKalorije(kalorije);
		this.setDanas(danas);
	}

	public int getKalorije() {
		return kalorije;
	}
	public void setKalorije(int kalorije) {
		if (kalorije > 0)
			this.kalorije = kalorije;
	}
	public LocalDate getDanas() {
		return danas;
	}
	public void setDanas(LocalDate danas) {
		this.danas = danas;
	}

	@Override
	public void izracunajCijenu() {
		LocalDate dani = LocalDate.now();
		if (danas.isBefore(dani.minusMonths(6))) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.1);
		} else {
			this.setUvoznaCijena(getUvoznaCijena() * 1.05);
		}
	}
}