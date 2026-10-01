import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite poluprečnik r1: ");
        double r1 = sc.nextDouble();
        System.out.print("Unesite poluprečnik r2: ");
        double r2 = sc.nextDouble();

        System.out.print("Unesite broj tačaka N: ");
        int N = sc.nextInt();

        int uPrvomKrugu = 0;
        int uDrugomKrugu = 0;
        int iznadPrave = 0;
        int ispodPrave = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Unesite koordinate tačke " + i + ":");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double d = Math.sqrt(x*x + y*y);

            if (d <= r1) uPrvomKrugu++;
            if (d <= r2) uDrugomKrugu++;

            if (x - y - 4 > 0) iznadPrave++;
            else if (x - y - 4 < 0) ispodPrave++;
        }

        System.out.println("Broj tačaka u prvom krugu: " + uPrvomKrugu);
        System.out.println("Broj tačaka u drugom krugu: " + uDrugomKrugu);
        System.out.println("Broj tačaka iznad prave: " + iznadPrave);
        System.out.println("Broj tačaka ispod prave: " + ispodPrave);
        sc.close();
    }
}
