
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite trocifreni broj: ");
        int broj = sc.nextInt();
        int cifra1 = broj / 100;          
        int cifra2 = (broj / 10) % 10;    
        int cifra3 = broj % 10;           
    
        int proizvod = cifra1 * cifra2 * cifra3;

        int zbir = cifra1 + cifra2 + cifra3;

        int sifra = proizvod - zbir;

        System.out.println("Šifra za otvaranje vrata je: " + sifra);
        sc.close();
        
    }
}
