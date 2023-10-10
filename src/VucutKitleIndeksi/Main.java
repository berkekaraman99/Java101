package VucutKitleIndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kg;
        double boy, indeks;

        System.out.print("Boyunuzu giriniz (metre cinsinden): ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kg = input.nextInt();

        indeks = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}
