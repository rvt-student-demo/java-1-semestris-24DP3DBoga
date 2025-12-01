package rvt;
import java.util.Scanner;

public class repeating_breaking_and_remembering {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 0;

        System.out.println("Give number: ");

        int count = -1;
    
        while(true) {
            int number = Integer.valueOf(sc.nextLine());
            count += 1;
            if (number == -1) {
                System.out.println("sosik");
                break;
            }

            summa += number;
        }
        System.out.println("Sum: " + summa);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + summa * 1.0 / count);
     }
}
