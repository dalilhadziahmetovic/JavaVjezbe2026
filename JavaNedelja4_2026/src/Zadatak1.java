import java.util.Scanner;
import java.util.Random;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        
        System.out.print("Unesite dužinu niza: ");
        int n = sc.nextInt();

      
        int[] niz = new int[n];

        
        for (int i = 0; i < n; i++) {
            niz[i] = rand.nextInt(100); 
        }

     
        System.out.println("Generisani niz:");
        for (int i = 0; i < n; i++) {
            System.out.print(niz[i] + " ");
        }
        for (int i = 0; i < n ; i++) {
        	if (i % 2 == 0 ) {
        niz[i] = -niz[i];}
        else {
        	double inv = 1.0 / niz[i];
            System.out.println("Inverzija elementa na indeksu " + i + " = " + inv);
        	}
        	}sc.close();
    }
    }

