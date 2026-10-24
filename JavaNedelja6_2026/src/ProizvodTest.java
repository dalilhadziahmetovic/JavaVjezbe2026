import java.time.LocalDate;
import java.util.ArrayList;

public class ProizvodTest {
	public static void main(String[] args) {
		Garderoba g1 = new Garderoba("majica", "2333455566677", "Crna Gora", 2026, 20, "pamuk", "ljeto");
		HemijskiProizvodi h1 = new HemijskiProizvodi("deterdzent", "2333455566678", "Srbija", 2025, 10, 25.0f, true);
		Hrana h2 = new Hrana("cokolada", "2333455566679", "Hrvatska", 2026, 5, 540, LocalDate.of(2026, 1, 15));

		ArrayList<Proizvod> lista = new ArrayList<>();
		lista.add(g1);
		lista.add(h1);
		lista.add(h2);

		System.out.println("Prije racunanja cijene:");
		for (Proizvod p : lista) {
			System.out.println(p);
		}

		for (Proizvod p : lista) {
			p.izracunajCijenu();
		}

		System.out.println("\nPoslije racunanja cijene:");
		for (Proizvod p : lista) {
			System.out.println(p);
		}
	}
}