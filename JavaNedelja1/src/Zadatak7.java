import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite koordinatu x drona: ");
        int x = sc.nextInt();
        System.out.print("Unesite koordinatu y drona: ");
        int y = sc.nextInt();

        System.out.print("Unesite broj paketa: ");
        int N = sc.nextInt();

        double ukupnaUdaljenost = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Unesite koordinate paketa " + i + ":");
            int xi = sc.nextInt();
            int yi = sc.nextInt();

            if (xi > 0 && yi > 0) {
                double udaljenost = Math.sqrt(Math.pow(xi - x, 2) + Math.pow(yi - y, 2));
                ukupnaUdaljenost += udaljenost;
            }
        }

        System.out.println("Ukupna udaljenost za pakete u prvom kvadrantu je: " + ukupnaUdaljenost);
        sc.close();
    }
}
