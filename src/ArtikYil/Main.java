package ArtikYil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if (year % 400 != 0) {
            if (year % 100 != 0) {
                if (year % 4 == 0) {
                    System.out.printf("%d bir artık yıldır !", year);
                } else {
                    System.out.printf("%d bir artık yıl değildir!", year);
                }
            } else {
                System.out.printf("%d bir artık yıl değildir!", year);
            }
        } else {
            System.out.printf("%d bir artık yıldır !", year);
        }
    }
}
