package Manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00, toplam = 0;
        int adet;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? ");
        adet = input.nextInt();
        toplam += armutFiyat * adet;

        System.out.print("Elma Kaç Kilo? ");
        adet = input.nextInt();
        toplam += elmaFiyat * adet;

        System.out.print("Domates Kaç Kilo? ");
        adet = input.nextInt();
        toplam += domatesFiyat * adet;

        System.out.print("Muz Kaç Kilo? ");
        adet = input.nextInt();
        toplam += muzFiyat * adet;

        System.out.print("Patlıcan Kaç Kilo? ");
        adet = input.nextInt();
        toplam += patlicanFiyat * adet;

        System.out.println("Toplam Tutar: " + toplam);
    }
}
