import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite trgovine (S-prodaja, B-kupovina):");
        String unos = sc.nextLine();

     
        String[] transakcije = unos.split("\\s+");

        int saldo = 0;

        for (String t : transakcije) {
            char tip = t.charAt(0); 
            int iznos = Integer.parseInt(t.substring(1));

            if (tip == 'S') {
                saldo += iznos;
            } else if (tip == 'B') {
                saldo -= iznos;
            }
        }

        if (saldo > 0) {
            System.out.println("Broker je u plusu: " + saldo);
        } else if (saldo < 0) {
            System.out.println("Broker je u minusu: " + saldo);
        } else {
            System.out.println("Broker je na nuli.");
        }
        sc.close();
    }
}
