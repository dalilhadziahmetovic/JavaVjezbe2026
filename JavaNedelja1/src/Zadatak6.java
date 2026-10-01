import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();

        int duzina = String.valueOf(broj).length();
        int suma = 0;

        for (int temp = broj; temp > 0; temp /= 10) {
            int cifra = temp % 10;
            suma += Math.pow(cifra, duzina);
        }

        if (suma == broj)
            System.out.println("Narcistički broj");
        else
            System.out.println("Nije narcistički broj");
        sc.close();
    }
}
