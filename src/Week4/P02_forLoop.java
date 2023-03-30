package Week4;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {


        /*
        Kullanicidan baslangic ve bitis degeri olarak
        pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini
         yazdirin. Bitis degeri baslangic degerinden kucukse,
          uyari yazdirip islemi sonlandirin

        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangıc degeri giriniz");
        int baslangicSayisi= scan.nextInt();
        System.out.println("Lutfen bitis degeri giriniz");
        int bitisSayisi= scan.nextInt();
        int toplam=0;

        if (bitisSayisi <baslangicSayisi){
            System.out.println("=====   Baslangic degeri bitis degerinden kucuk olmalidir. ===");

        }else {
            for (int i = baslangicSayisi; i <=bitisSayisi; i++) {

                toplam+=i;


            }
            System.out.println("Girilen degerler toplami : " + toplam);

        }



    }
}
