
public class Televizor {
	private int brojKanala;
	private String nazivKanala;
	private int jacinaZvuka;
	
	public Televizor(int brojKanala, String nazivKanala, int jacinaZvuka) {
		this.brojKanala = brojKanala;
		this.nazivKanala = nazivKanala;
		this.jacinaZvuka = jacinaZvuka;
	}
	
	
	public int getBrojKanala() {
		return brojKanala;
	}


	public void setBrojKanala(int brojKanala) {
		if (brojKanala >= 1) {
		this.brojKanala = brojKanala;
	} else {
		System.out.println("Greska, broj kanala mora biti barem 1"); }
	}


	public String getNazivKanala() {
		return nazivKanala;
	}


	public void setNazivKanala(String nazivKanala) {
		if (jacinaZvuka >= 0 && jacinaZvuka <= 10) {
		this.nazivKanala = nazivKanala;
	} else {
		System.out.println("Greska");	}
	}


	public int getJacinaZvuka() {
		return jacinaZvuka;
	}


	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public void pojacajTon() {
		if (this.jacinaZvuka < 10) {
			this.jacinaZvuka ++;

		} else {
			System.out.println("Maksimalna jacina tona.");
	}
}
		public void stampa() {
			System.out.println("Broj kanala : " + this.brojKanala);
			System.out.println("Naziv kanala : " + this.nazivKanala);
			System.out.println("Jacina zvuka : " + this.jacinaZvuka);
		}


	public static void main(String[] args) {
		Televizor televizor1 = new Televizor(10, "Prvi kanal", 5);
		
		System.out.println(televizor1.getBrojKanala());
		televizor1.setBrojKanala(0);
		System.out.println(televizor1.getBrojKanala());
		televizor1.pojacajTon();
		System.out.print(televizor1.getJacinaZvuka());
		
		televizor1.stampa();

	}

}
