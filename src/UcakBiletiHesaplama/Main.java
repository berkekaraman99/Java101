package UcakBiletiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTipi;
        double mesafeBasiTutar = 0.10, normal_tutar, yas_indirimi,
                indirimli_tutar, toplam_tutar, gidis_donus_indirimi = 0;


        System.out.print("Mesafeyi (KM) giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.println("1 => Tek Yön\n2 => Gidiş-Dönüş\nYolculuk tipini giriniz.");
        yolculukTipi = input.nextInt();

        if (yolculukTipi != 1 && yolculukTipi != 2 || (yas <= 0 || mesafe <= 0)) {
            System.out.println("Hatalı veri girdiniz");
            return;
        }

        normal_tutar = mesafe * mesafeBasiTutar;
        yas_indirimi = yas < 12 ? normal_tutar * 0.50 :
                (yas < 24) ? normal_tutar * 0.10 :
                        (yas > 65) ? normal_tutar * 0.30 : 0;
        indirimli_tutar = normal_tutar - yas_indirimi;
        if (yolculukTipi == 2) {
            gidis_donus_indirimi = indirimli_tutar * 0.20;
        }

        toplam_tutar = (indirimli_tutar - gidis_donus_indirimi) * (yolculukTipi == 2 ? 2 : 1);

        System.out.println("Toplam Tutar: " + toplam_tutar);
    }
}
