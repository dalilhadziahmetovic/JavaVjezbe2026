import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite rečenicu:");
        String recenica = sc.nextLine();

        String[] rijeci = recenica.trim().split(" ");

        int brojRijeci = rijeci.length;
        
        System.out.println("Broj riječi u rečenici je: " + brojRijeci);
        sc.close();
    }
}
