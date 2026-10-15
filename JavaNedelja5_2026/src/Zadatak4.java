import java.util.ArrayList;

public class Zadatak4 {
    private String naziv;
    private String drzava;
    private double ocjena;
    private double udaljenostKm;
    private int brojPosjeta;

    public Zadatak4(String naziv, String drzava, double ocjena, double udaljenostKm, int brojPosjeta) {
        this.naziv = naziv;
        this.drzava = drzava;
        this.ocjena = ocjena;
        this.udaljenostKm = udaljenostKm;
        this.brojPosjeta = brojPosjeta;
    }

    public String getNaziv() { return naziv; }
    public String getDrzava() { return drzava; }
    public double getOcjena() { return ocjena; }
    public double getUdaljenostKm() { return udaljenostKm; }
    public int getBrojPosjeta() { return brojPosjeta; }

    public static void main(String[] args) {
        ArrayList<Zadatak4> lista = new ArrayList<>();

        lista.add(new Zadatak4("Pariz", "Francuska", 9.2, 1500, 120));
        lista.add(new Zadatak4("Dubrovnik", "Hrvatska", 8.5, 600, 90));
        lista.add(new Zadatak4("Rim", "Italija", 7.8, 900, 70));
        lista.add(new Zadatak4("Beč", "Austrija", 9.0, 800, 110));

        System.out.println("Destinacije sa ocjenom > 8 i udaljenost < 1000 km:");
        for (Zadatak4 d : lista) {
            if (d.getOcjena() > 8 && d.getUdaljenostKm() < 1000) {
                System.out.println(d.getNaziv() + " (" + d.getDrzava() + ")");
            }
        }

        Zadatak4 najposjecenija = lista.get(0);
        for (Zadatak4 d : lista) {
            if (d.getBrojPosjeta() > najposjecenija.getBrojPosjeta()) {
                najposjecenija = d;
            }
        }
        System.out.println("\nNajposjećenija destinacija: " + najposjecenija.getNaziv());

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).getOcjena() < lista.get(j).getOcjena()) {
                    Zadatak4 temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }

        System.out.println("\nSortirane destinacije po ocjeni (opadajuće):");
        for (Zadatak4 d : lista) {
            System.out.println(d.getNaziv() + " - " + d.getOcjena());
        }
    }
}
