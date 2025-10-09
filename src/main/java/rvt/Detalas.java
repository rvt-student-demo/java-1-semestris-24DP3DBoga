package rvt;
import java.util.Scanner;

public class Detalas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SKRUVE_PRICE = 5;
        final int UZRIEZNI_PRICE = 3;
        final int PAPLAS_PRICE = 1;

        System.out.println("Ievadi skruves skaitli:");
        int skruve_sk=Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi uzdrieznu skaitli:");
        int uzgriezni_sk=Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi paplas skaitli:");
        int paplas_sk=Integer.valueOf(scanner.nextLine());
        
        int summa = (skruve_sk * SKRUVE_PRICE) + (uzgriezni_sk * UZRIEZNI_PRICE) + (paplas_sk * PAPLAS_PRICE);

        if (uzgriezni_sk >= skruve_sk && paplas_sk >= 2 * skruve_sk) {
            System.out.println(summa);
        }
        else if (uzgriezni_sk >= skruve_sk && paplas_sk < 2 * skruve_sk) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        }
        else if (uzgriezni_sk < skruve_sk && paplas_sk >= 2 * skruve_sk) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
        }
        else {
            System.out.println("Kluda");
        }

    }
}
