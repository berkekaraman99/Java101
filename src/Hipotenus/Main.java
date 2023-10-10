package Hipotenus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //HİPOTENÜS UZUNLUĞU BULMA
        int a, b;
        double c;

        System.out.print("1. Kenar: ");
        a = input.nextInt();
        System.out.print("2. Kenar: ");
        b = input.nextInt();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenüs Uzunluğu: " + c);


        //ÜÇGEN ALANI BULMA
        int kenar1, kenar2, kenar3;
        double alan, u;

        System.out.print("1.Kenar Uzunluğu: ");
        kenar1 = input.nextInt();

        System.out.print("2.Kenar Uzunluğu: ");
        kenar2 = input.nextInt();

        System.out.print("3.Kenar Uzunluğu: ");
        kenar3 = input.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2.0;

        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
