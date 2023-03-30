package Week08;

import java.util.Arrays;

public class C02_Arrays_Tamsayi_Ekleme_Metodu {
    public static void main(String[] args) {
        /*
        Verilen bir array’deki pozitif tamsayilari toplayip
        sonucu bize donduren bir method yaziniz.
         */

        int [] arr = {1,2,3,4,5,6,-5,-8,-7,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println(arraydekiPozitifSayilariTopla(arr));
    }

    public static int arraydekiPozitifSayilariTopla(int [] arr) {

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr [i]>0){
                toplam+= arr [i];
            }

        }return toplam;

    }
}
