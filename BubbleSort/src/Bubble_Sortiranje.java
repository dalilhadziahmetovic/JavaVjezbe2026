import java.util.Scanner;

public class Bubble_Sortiranje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite dužinu niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (niz[j] > niz[j + 1]) {
                    int temp = niz[j];
                    niz[j] = niz[j + 1];
                    niz[j + 1] = temp;
                }
            }
        }

        System.out.println("Sortiran niz:");
        for (int i = 0; i < n; i++) {
            System.out.print(niz[i] + " ");
        }
        sc.close();
    }
}
