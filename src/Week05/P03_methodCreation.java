package Week05;

import java.util.Scanner;

public class P03_methodCreation {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde pozitif bir tamsayi alin.
        Girilen sayinin asal sayi olup olmadigini kontrol edip,
        sonuc olarak “asal sayi” veya “asal sayi degil”
        sonuclarini donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi girin :");
        int sayi= scan.nextInt();
        System.out.println(asalSayiKontrolEt(sayi));
    }

    public static String asalSayiKontrolEt(int sayi) {
       String sonuc = "sayi asal sayidir";

        for (int i = 2; i  <sayi ; i++) {
            if (sayi%i==0){
                sonuc="sayi asal sayi degildir";
            }
        }
        return sonuc;
    }
}
