import java.util.ArrayList;

abstract class Vozilo {
    protected int id;
    protected double maxBrzina;

    public Vozilo(int id, double maxBrzina) {
        this.id = id;
        this.maxBrzina = maxBrzina;
    }

    public void info() {
        System.out.println("ID vozila: " + id + ", maksimalna brzina: " + maxBrzina + " km/h");
    }

    public abstract double izracunajVrijemeDostave(double udaljenostKm);
}

interface Ekonomican {
    double potrosnjaPoKm();
}

class Bicikl extends Vozilo implements Ekonomican {
    public Bicikl(int id) {
        super(id, 20);
    }

    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / maxBrzina * 60;
    }

    public double potrosnjaPoKm() {
        return 0.0;
    }
}

class Motor extends Vozilo implements Ekonomican {
    public Motor(int id) {
        super(id, 60);
    }

    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / maxBrzina * 60;
    }

    public double potrosnjaPoKm() {
        return 0.03;
    }
}

class Automobil extends Vozilo {
    public Automobil(int id) {
        super(id, 100);
    }

    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / maxBrzina * 60;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Vozilo> vozila = new ArrayList<>();
        vozila.add(new Bicikl(1));
        vozila.add(new Motor(2));
        vozila.add(new Automobil(3));

        double udaljenost = 10;

        int brojEkonomicnih = 0;
        double ukupnaPotrosnja = 0;
        Vozilo najbrze = vozila.get(0);
        Vozilo najsporije = vozila.get(0);

        for (Vozilo v : vozila) {
            System.out.println("Tip: " + v.getClass().getSimpleName());
            v.info();

            double vrijeme = v.izracunajVrijemeDostave(udaljenost);
            System.out.printf("Vrijeme dostave za %.0f km: %.2f min%n", udaljenost, vrijeme);

            if (v instanceof Ekonomican) {
                Ekonomican e = (Ekonomican) v;
                double potrosnja = e.potrosnjaPoKm() * udaljenost;
                System.out.printf("Potrosnja na %.0f km: %.2f L%n", udaljenost, potrosnja);

                brojEkonomicnih++;
                ukupnaPotrosnja += potrosnja;
            } else {
                System.out.println("Vozilo nije ekonomicno.");
            }

            if (vrijeme < najbrze.izracunajVrijemeDostave(udaljenost)) {
                najbrze = v;
            }
            if (vrijeme > najsporije.izracunajVrijemeDostave(udaljenost)) {
                najsporije = v;
            }

            System.out.println("-----------------------------");
        }

        System.out.println("\n===== REZIME =====");
        System.out.println("Ukupno vozila: " + vozila.size());
        System.out.println("Ekonomicnih vozila: " + brojEkonomicnih);
        System.out.printf("Najbrza dostava: %s (ID %d) - %.2f min%n",
                najbrze.getClass().getSimpleName(), najbrze.id,
                najbrze.izracunajVrijemeDostave(udaljenost));
        System.out.printf("Najsporija dostava: %s (ID %d) - %.2f min%n",
                najsporije.getClass().getSimpleName(), najsporije.id,
                najsporije.izracunajVrijemeDostave(udaljenost));
        System.out.printf("Ukupna potrosnja ekonomicnih vozila: %.2f L%n", ukupnaPotrosnja);
    }
}