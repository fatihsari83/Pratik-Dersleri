package Week3;

import java.util.Scanner;

public class P06_TernaryOperator {
    public static void main(String[] args) {

        /*
        1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
"Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        //System.out.println("Lutfen ucgenin kenar uzunlıklarini girin");
        //int a= scan.nextInt();
        //int b= scan.nextInt();
        //int c= scan.nextInt();

        //System.out.println((a == b && a == c ? "Eskenar Ucgen" : "Eskenar Ucgen Degildir."));

        //if (a==b && a==c){
          //  System.out.println("Ucgen 'Eskenar Ucgen' dir");
        //}else {
          //  System.out.println("Ucgen 'Eskenar Degil'");
        //}

        /*
    2- Kullanicidan bir harf isteyin, girilen karakter
     kucuk harf ise onu buyuk harf olarak yazdirin,
      yoksa girilen harfi yazdirin
     */

        //System.out.println("Lutfen bir harf giriniz: ");
        //char harf=scan.next().charAt(0);
        //System.out.println((harf >= 97 && harf < 122) ? (char) (harf - 32) : harf);
        //System.out.println((harf >= 'a' && harf <= 'z' ? (char)(harf - 32): harf));

        // 3-kullanicidan 2 adet sayi isteyin ve
        //  buyuk olmayan sayiyi yazdirin

        //System.out.println("Lutfen iki sayi giriniz :");
       // System.out.println("1.sayi:");
        //int a= scan.nextInt();
        //System.out.println("2. sayi :");
        //int b= scan.nextInt();

        //System.out.println((a > b ? "Buyuk olmayan sayi : " + b : "Buyuk olmayan sayi" + a));

        //Kullanicidan notunu alin 50 veya daha buyukse
        // "Sinifi Gectin", 50’den
        //kucukse "Maalesef kaldin" yazdirin.

        System.out.println("Lutfen noyunuzu giriniz :");
        int not= scan.nextInt();
        System.out.println((not >= 50 ? "Sinifi " + not + " rtalamasi ile gectiniz." : "Maalesef " + not + " ortalama ile kaldiniz"));

    }





}
