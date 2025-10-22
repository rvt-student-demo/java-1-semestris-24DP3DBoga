package rvt;
import java.util.Scanner;

public class repeating_breaking_and_remembering {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 0;

        System.out.println("Give number: ");

        while(true) {
            int number = Integer.valueOf(sc.nextLine());
            if (number == -1) {
                System.out.println("sosik");
                break;
            }

            summa += number;
        }
        System.out.println("Sum " + summa);
     }
}
