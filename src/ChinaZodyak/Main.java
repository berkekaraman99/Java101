package ChinaZodyak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, kalan;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        kalan = year % 12;
        switch (kalan) {
            case 0:
                if (year > 0) {
                    burc = "Maymun";
                } else {
                    isError = true;
                }
                break;
            case 1:
                if (year > 0) {
                    burc = "Horoz";
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (year > 0) {
                    burc = "Köpek";
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (year > 0) {
                    burc = "Domuz";
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (year > 0) {
                    burc = "Fare";
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (year > 0) {
                    burc = "Öküz";
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (year > 0) {
                    burc = "Kaplan";
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (year > 0) {
                    burc = "Tavşan";
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (year > 0) {
                    burc = "Ejderha";
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (year > 0) {
                    burc = "Yılan";
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (year > 0) {
                    burc = "At";
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (year > 0) {
                    burc = "Koyun";
                } else {
                    isError = true;
                }
                break;

        }

        if (isError) {
            System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar deneyiniz");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
