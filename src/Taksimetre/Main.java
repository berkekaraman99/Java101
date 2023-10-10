package Taksimetre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double perKm = 2.20, total = 10;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        total += km * perKm;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Tutar: " + total);
    }
}
