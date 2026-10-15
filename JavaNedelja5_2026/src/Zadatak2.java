import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite riječ ili rečenicu: ");
        String unos = sc.nextLine();

        String rijec = unos.replaceAll("\\s+", "").toLowerCase();

        StringBuilder sb = new StringBuilder(rijec);
        String obrnuto = sb.reverse().toString();

        if (rijec.equals(obrnuto)) {
            System.out.println("Unos \"" + unos + "\" je palindrom.");
        } else {
            System.out.println("Unos \"" + unos + "\" nije palindrom.");
        }
  sc.close();  }
}
