import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite dužinu dijagonale: ");
        double d = sc.nextDouble();

        System.out.print("Unesite prvu vrijednost odnosa (a): ");
        double a = sc.nextDouble();
        System.out.print("Unesite drugu vrijednost odnosa (b): ");
        double b = sc.nextDouble();

        double k = d / Math.sqrt(a*a + b*b);
    
        double sirina = k * a;
        double visina = k * b;

        double povrsina = sirina * visina;

        System.out.println("Širina ekrana: " + sirina);
        System.out.println("Visina ekrana: " + visina);
        System.out.println("Površina ekrana je: " + povrsina);
        sc.close();
    }
}
