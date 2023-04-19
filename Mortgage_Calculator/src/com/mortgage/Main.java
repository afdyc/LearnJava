package com.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        double monthlyInterest = annualInterest/100/12;
        int totalPeriod = period * 12;
        double interestPowered = Math.pow((1+monthlyInterest), totalPeriod);
        double mortgage = principle * ((monthlyInterest * interestPowered)/(interestPowered - 1));
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
    }
}