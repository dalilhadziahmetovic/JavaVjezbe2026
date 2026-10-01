
public class Zaposleni {
	
	
	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;

	public Zaposleni(String ime, String prezime, int godineStaza,
	double plata) {
	this.ime = ime;
	this.prezime = prezime;
	this.godineStaza = godineStaza;
	this.plata = plata;
	}
	
	public String getIme() { return ime; }
	public String getPrezime() { return prezime; }
	public int getGodineStaza() { return godineStaza; }
	public double getPlata() { return plata; }

	public void setIme(String ime) {
	this.ime = ime;
	}
	public void setPrezime(String prezime) {
	this.prezime = prezime;
	}
	public void setGodineStaza(int godineStaza) {
	this.godineStaza = godineStaza;
	}
	public void setPlata(double plata) {
	this.plata = plata;
	
	}
	
	public void ispisi() {
	System.out.println(ime + " " + prezime + ", godine staža: " +
	godineStaza + ", plata: " + plata);
	}
	public void provjeriIPovecajPlatuAkoTreba() {
		if (plata < 800 && godineStaza > 10) {
		double stara = plata;
		plata = plata + plata * 0.06;
		System.out.println(ime + " " + prezime + ": plata povećana sa " + stara + " na " + plata);
		}
		}
	public static void main(String[] args) {
	Zaposleni z1 = new Zaposleni("Ana", "Markovic", 5, 750);
	Zaposleni z2 = new Zaposleni("Marko", "Jovanovic", 12, 790);
	Zaposleni z3 = new Zaposleni("Petar", "Petrovic", 4, 850);

	z1.ispisi();
	z2.ispisi();
	z3.ispisi();
	z2.provjeriIPovecajPlatuAkoTreba();
	}}
	

