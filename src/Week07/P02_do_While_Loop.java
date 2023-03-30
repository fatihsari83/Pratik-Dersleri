package Week07;

import java.util.Scanner;

public class P02_do_While_Loop {
    public static void main(String[] args) {

        /*
         Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde "Sifreniz Kabul edilmistir" yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
         */

        Scanner scan = new Scanner(System.in);

        //int sifre = scan.nextInt();
        String sifre = "";
        int sayac = 0;

        do {
            System.out.println("Lutfen bir şifre girin");
            sifre = scan.nextLine();

            for (int i = 0; i < sifre.length(); i++) {
                if ((sifre.charAt(i)  >= 65 && sifre.charAt(i)  <= 90)) {

                    sayac++;
                }else {
                    System.out.println("Sifre buyuk harf icermelidir");

                }
                if ((sifre.charAt(i)  >= 97 && sifre.charAt(i)  <= 122)) {

                    sayac++;
                }else {
                    System.out.println("Sifre kucuk harf icermelidir !");

                }
                if ((sifre.charAt(i)  >= 32 && sifre.charAt(i)  <= 64)) {

                    sayac++;
                }else {
                    System.out.println("Sifre ozel karakter icermelidir");
                }
                if (sifre.length() > 8) {

                    sayac++;
                }else {
                    System.out.println("Sifre en az 8 karakter olmalidir");
                }
                break;
            }
            if (sayac==4){
                System.out.println("Sifreniz basarıyla kaydedildi!");
            }
        }while (sayac!=4);

    }
}
