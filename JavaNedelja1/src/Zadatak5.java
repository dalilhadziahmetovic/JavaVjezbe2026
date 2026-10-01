import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite cijenu prvog proizvoda: ");
        int c1 = sc.nextInt();
        System.out.print("Unesite cijenu drugog proizvoda: ");
        int c2 = sc.nextInt();
        System.out.print("Unesite cijenu trećeg proizvoda: ");
        int c3 = sc.nextInt();

        int zbir12 = c1 + c2;
        int zbir13 = c1 + c3;
        int zbir23 = c2 + c3;

        int maxZbir = zbir12;
        String par = "proizvod 1 i proizvod 2";

        if (zbir13 > maxZbir) {
            maxZbir = zbir13;
            par = "proizvod 1 i proizvod 3";
        }
        if (zbir23 > maxZbir) {
            maxZbir = zbir23;
            par = "proizvod 2 i proizvod 3";
        }

        System.out.println("Najveći zbir je " + maxZbir + ", a daju ga " + par + ".");
        sc.close();
    }
}
