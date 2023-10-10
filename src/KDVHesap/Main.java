package KDVHesap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    double tutar, kdv_orani = 0.18, kdv_tutari, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Para değerini girin: ");
        tutar = input.nextInt();

        kdv_tutari = tutar * kdv_orani;
        toplam = tutar + kdv_tutari;
        System.out.println("KDV Oranı: " + kdv_orani);
        System.out.println("KDV Tutarı: " + kdv_tutari);
        System.out.println("KDV'li fiyat: " + toplam);
    }
}
