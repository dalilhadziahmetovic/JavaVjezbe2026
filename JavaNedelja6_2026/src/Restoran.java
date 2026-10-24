import java.util.ArrayList;

public class Restoran {
	private String naziv;
	private String adresa;
	private String pib;
	private ArrayList<Zaposleni> zaposleni = new ArrayList<>();
	private ArrayList<Smjena> smjene = new ArrayList<>();
	private ArrayList<ObracunPlate> istorijaObracuna = new ArrayList<>();

	public Restoran(String naziv, String adresa, String pib) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
	}

	public void dodajZaposlenog(Zaposleni z) {
		if (pronadjiPoId(z.getId()) == null) {
			zaposleni.add(z);
		} else {
			System.out.println("Zaposleni sa ID " + z.getId() + " vec postoji!");
		}
	}

	public void ukloniZaposlenog(int id) {
		Zaposleni z = pronadjiPoId(id);
		if (z != null) {
			zaposleni.remove(z);
		} else {
			System.out.println("Ne postoji zaposleni sa ID " + id);
		}
	}

	public Zaposleni pronadjiPoId(int id) {
		for (Zaposleni z : zaposleni) {
			if (z.getId() == id) {
				return z;
			}
		}
		return null;
	}

	public void dodajSmjenu(Smjena s) {
		smjene.add(s);
	}

	public void izracunajSateIzSmjena() {
		for (Zaposleni z : zaposleni) {
			double sati = 0;
			for (Smjena s : smjene) {
				if (s.getZaposleni().contains(z)) {
					sati = sati + s.getBrojSati();
				}
			}
			if (sati > 0) {
				z.setUkupanBrojSati(sati);
			}
		}
	}

	public void generisiObracun(int mjesec, int godina) {
		System.out.println("Obracun plata - " + naziv + " (PIB: " + pib + ") za " + mjesec + "/" + godina);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("%-4s %-20s %-10s %-8s %-25s %12s%n", "ID", "Ime i prezime", "Tip", "Sati",
				"Prekovremeni / bonus", "Plata (EUR)");
		System.out.println("------------------------------------------------------------------------------------");

		for (Zaposleni z : zaposleni) {
			double plata = z.izracunajPlatu();
			istorijaObracuna.add(new ObracunPlate(mjesec, godina, z, plata, z.getNapomena()));

			System.out.printf("%-4d %-20s %-10s %-8.1f %-25s %12.2f%n", z.getId(),
					z.getIme() + " " + z.getPrezime(), z.getTip(), z.getUkupanBrojSati(), z.getNapomena(), plata);
		}
		System.out.println("------------------------------------------------------------------------------------");
	}

	public double ukupanTrosak(int mjesec, int godina) {
		double ukupno = 0;
		for (ObracunPlate o : istorijaObracuna) {
			if (o.getMjesec() == mjesec && o.getGodina() == godina) {
				ukupno = ukupno + o.getIznos();
			}
		}
		return ukupno;
	}

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}
	public ArrayList<ObracunPlate> getIstorijaObracuna() {
		return istorijaObracuna;
	}
}