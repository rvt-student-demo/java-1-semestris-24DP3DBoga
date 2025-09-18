package rvt;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Give the third number: ");
        int num3 = scanner.nextInt();

        Double average = (num1 + num2 + num3) / 3.0;

        System.out.println("The average is:" + average);
    }
    
}
