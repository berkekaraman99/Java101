package UserLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String adminUsername = "patika", username, adminPassword = "java123", password, answer;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)){
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Bilgileriniz Hatalı");
            if (!password.equals("java123")) {
                System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır) ");
                answer = input.nextLine();
                if (answer.equals("Evet")) {
                        System.out.print("Yeni Şifrenizi Giriniz: ");
                        password = input.nextLine();
                        if (password.equals(adminPassword)) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                        }
                        else {
                            System.out.println("Yeni şifre oluşturuldu.");
                            adminPassword = password;
                        }
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
            }
        }
        input.close();
    }
}
