package WeatherEventSuggestion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;

        System.out.println("Sıcaklık Değerine Göre Öneri\n");
        System.out.print("Sıcaklık değerini giriniz: ");
        temp = input.nextInt();

        System.out.printf("Sıcaklık değeri %d C. ", temp);

        if (temp < 5) {
            System.out.println("Kayak yapmanızı öneririz.");
        } else if (temp < 15) {
            System.out.println("Sinemaya gitmenizi öneririz.");
        } else if (temp < 25) {
            System.out.println("Piknik yapmanızı öneririz.");
        } else {
            System.out.println("Yüzmenizi öneririz.");
        }

        System.out.println((temp < 5) ? "Kayak" :
                        (temp < 15) ? "Sinema" :
                                (temp < 25) ? "Piknik" : "Yüzme"
        );
    }
}
