package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        long a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the operation: ");
        String operation = sc.nextLine();
        System.out.print("Enter the second number: ");
        long b = sc.nextInt();

        switch (operation) {
            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;

            case "*":
                System.out.println(a * b);
                break;

            case "/":
                System.out.println(a / b);
                break;

            default:
                System.out.println("Incorrect input!");
                break;
        }
    }
}
