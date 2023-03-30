package Week05;

import java.util.Scanner;

public class P05_methodCreation {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde bir tamsayi alin.
            Girilen sayinin pozitif tam bolenlerin toplamini
            bulup bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz :");
        int sayi= scan.nextInt();

        System.out.println(pozitifTamBolenlerinToplami(sayi));
    }

    public static int pozitifTamBolenlerinToplami(int sayi) {
     int toplam=0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }


        return toplam;
    }
}
