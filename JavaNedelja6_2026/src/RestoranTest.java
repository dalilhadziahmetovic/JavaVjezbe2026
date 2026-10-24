import java.time.LocalDate;
import java.time.LocalTime;

public class RestoranTest {
	public static void main(String[] args) {
		Restoran r = new Restoran("Restoran Jadran", "Obala bb, Tivat", "02345678");

		Konobar k1 = new Konobar(1, "Marko", "Markovic", 5, 40, 5);
		Konobar k2 = new Konobar(2, "Ana", "Petrovic", 5, 35, 0);
		Kuvar ku1 = new Kuvar(3, "Nikola", "Jovanovic", 4, 40);
		Kuvar ku2 = new Kuvar(4, "Jelena", "Vukovic", 4.5, 0);
		Menadzer m1 = new Menadzer(5, "Petar", "Radovic", 6, 40, 200);
		Konobar k3 = new Konobar(6, "Ivan", "Ivanovic", 5, 20, 0);

		r.dodajZaposlenog(k1);
		r.dodajZaposlenog(k2);
		r.dodajZaposlenog(ku1);
		r.dodajZaposlenog(ku2);
		r.dodajZaposlenog(m1);
		r.dodajZaposlenog(k3);

		r.ukloniZaposlenog(6);

		Zaposleni trazeni = r.pronadjiPoId(3);
		System.out.println("Pronadjen po ID 3: " + trazeni);

		k2.setPrekovremeniSati(4);
		m1.setBonus(250);

		for (int i = 1; i <= 5; i++) {
			Smjena s;
			if (i % 2 == 0) {
				s = new Smjena(LocalDate.of(2026, 10, i), LocalTime.of(14, 0), LocalTime.of(22, 0), "popodnevna");
			} else {
				s = new Smjena(LocalDate.of(2026, 10, i), LocalTime.of(6, 0), LocalTime.of(14, 0), "jutarnja");
			}
			s.dodajZaposlenog(ku2);
			r.dodajSmjenu(s);
		}
		r.izracunajSateIzSmjena();
		System.out.println("Sati za " + ku2.getIme() + " iz smjena: " + ku2.getUkupanBrojSati());
		System.out.println();

		r.generisiObracun(10, 2026);

		System.out.printf("Ukupan trosak plata za 10/2026: %.2f EUR%n", r.ukupanTrosak(10, 2026));
	}
}