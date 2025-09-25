package rvt;

import java.util.Scanner;

public class Delikatees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        int cena = scanner.nextInt();

        System.out.print("Ekspress piegade (0==ne, 1==ja): ");
        int ekspress = scanner.nextInt();

        int piegade;

        if(cena < 10) {
            piegade = 2;
        } else {
            piegade = 0;
        }

        if (ekspress == 0) {
            piegade += 0;
        } else {
            piegade += 3;
        }

        int kopa;
        kopa = cena + piegade;

        System.out.println("Rekins ");
        System.out.println(prece + " " + cena);
        System.out.println("piegade " + piegade);
        System.out.println("kopa " + kopa);
    }
}
