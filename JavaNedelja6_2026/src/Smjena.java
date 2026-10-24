import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Smjena {
	private LocalDate datum;
	private LocalTime pocetak;
	private LocalTime kraj;
	private String tipSmjene;
	private ArrayList<Zaposleni> zaposleni = new ArrayList<>();

	public Smjena(LocalDate datum, LocalTime pocetak, LocalTime kraj, String tipSmjene) {
		this.datum = datum;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.tipSmjene = tipSmjene;
	}

	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}

	public double getBrojSati() {
		int minuti = (kraj.getHour() * 60 + kraj.getMinute()) - (pocetak.getHour() * 60 + pocetak.getMinute());
		if (minuti < 0) {
			minuti = minuti + 24 * 60;
		}
		return minuti / 60.0;
	}

	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public LocalTime getPocetak() {
		return pocetak;
	}
	public void setPocetak(LocalTime pocetak) {
		this.pocetak = pocetak;
	}
	public LocalTime getKraj() {
		return kraj;
	}
	public void setKraj(LocalTime kraj) {
		this.kraj = kraj;
	}
	public String getTipSmjene() {
		return tipSmjene;
	}
	public void setTipSmjene(String tipSmjene) {
		this.tipSmjene = tipSmjene;
	}
	public ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}
}