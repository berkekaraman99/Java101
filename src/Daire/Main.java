package Daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        int r1;
        double alan1, cevre1;

        System.out.print("Yarıçapı Giriniz: ");
        r1 = input.nextInt();

        alan1 = PI * r1 * r1;
        cevre1 = 2 * PI * r1;

        System.out.println("Dairenin Alanı: " + alan1);
        System.out.println("Dairenin Çevresi: " + cevre1);

        int r,a;
        double alan;

        System.out.print("Yarıçapı giriniz: ");
        r = input.nextInt();

        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        a = input.nextInt();

        alan = (PI * Math.pow(r,2) * a) / 360;
        System.out.println("Dairenin Alanı: " + alan);
    }
}
