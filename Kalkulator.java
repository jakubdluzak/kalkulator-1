package kalkulator;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        double wynik = 0;

        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");

        System.out.println("Wybierz typ działania: ");
        Scanner sc = new Scanner(System.in); 
        int rodzajDziałania = sc.nextInt();

        System.out.println("Podaj pierwszą liczbę: ");
        double pierwsza = sc.nextDouble();

        System.out.println("Podaj drugą liczbę: ");
        double druga = sc.nextDouble();

        if (rodzajDziałania == 1)
            wynik = pierwsza + druga;

        if (rodzajDziałania == 2)
            wynik = pierwsza - druga;

        if (rodzajDziałania == 3)
            wynik = pierwsza * druga;

        if (rodzajDziałania == 4)
            wynik = pierwsza / druga;

        System.out.println("Wynik: " + wynik);

    }
    
}