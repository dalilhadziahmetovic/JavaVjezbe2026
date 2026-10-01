import java.util.Scanner;

public class Zadatak2 {


    public static boolean prekrivaProzor(
            int px1, int py1, int px2, int py2,
            int zx1, int zy1, int zx2, int zy2 
    ) {
        return (zx1 <= px1 && zy1 <= py1 && zx2 >= px2 && zy2 >= py2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite koordinate prozora:");
        System.out.print("Gornja lijeva x: ");
        int px1 = sc.nextInt();
        System.out.print("Gornja lijeva y: ");
        int py1 = sc.nextInt();
        System.out.print("Donja desna x: ");
        int px2 = sc.nextInt();
        System.out.print("Donja desna y: ");
        int py2 = sc.nextInt();

        System.out.println("Unesite koordinate zavjese:");
        System.out.print("Gornja lijeva x: ");
        int zx1 = sc.nextInt();
        System.out.print("Gornja lijeva y: ");
        int zy1 = sc.nextInt();
        System.out.print("Donja desna x: ");
        int zx2 = sc.nextInt();
        System.out.print("Donja desna y: ");
        int zy2 = sc.nextInt();

       
        if (prekrivaProzor(px1, py1, px2, py2, zx1, zy1, zx2, zy2)) {
            System.out.println("Zavjesa prekriva prozor.");
        } else {
            System.out.println("Zavjesa NE prekriva prozor.");
        } sc.close();
    }
}
