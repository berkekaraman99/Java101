package SinifGecme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) sum += mat;

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) sum += turkce;

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) sum += fizik;

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) sum += kimya;

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) sum += muzik;

        double average = sum / 5.0;

        System.out.printf("Ortalamanız %f\n", average);

        if (average >= 55) {
            System.out.println("Geçtiniz!");
        } else {
            System.out.println("Kaldınız!");
        }
    }
}
