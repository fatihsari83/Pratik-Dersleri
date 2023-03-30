package Week05;

import java.util.Scanner;

public class P04_methodCreation  {
    public static void main(String[] args) {

        /*
            Kullanicidan main method icinde bir tamsayi alin.
            Girilen sayinin pozitif tam bolenleri sayisini
            bulup bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz :");
        int sayi= scan.nextInt();
        System.out.println(pozitifBolenleriBulma(sayi));
    }

    public static int pozitifBolenleriBulma(int sayi) {

        int sayac=0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                sayac++;
            }
        }



        return sayac;
    }
}
