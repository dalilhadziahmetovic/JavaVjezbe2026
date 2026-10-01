import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj x: ");
        int x = sc.nextInt();

        System.out.print("Unesite stepen n: ");
        int n = sc.nextInt();

        int rezultat = 1;
        for (int i = 0; i < n; i++) {
            rezultat *= x;
        }

        System.out.println(x + "^" + n + " = " + rezultat);
        sc.close();
    }
}
