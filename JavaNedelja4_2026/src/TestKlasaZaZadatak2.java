import java.util.Scanner;

public class TestKlasaZaZadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Unesite dužinu niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        
        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }

       
        double prosjek = Zadatak2.nadjiParniPozitivniProsjek(niz);

     
        if (prosjek == 0) {
            System.out.println("U nizu nema pozitivnih parnih brojeva.");
        } else {
            System.out.println("Prosječna vrijednost pozitivnih parnih brojeva je: " + prosjek);
        }sc.close();
    }
}
