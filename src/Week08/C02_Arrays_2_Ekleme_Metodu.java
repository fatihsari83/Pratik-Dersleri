package Week08;

import java.util.Arrays;

public class C02_Arrays_2_Ekleme_Metodu {
    public static void main(String[] args) {
        /*
Verilen bir int array'in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array'i yeni haliyle kaydedin.
 */

        int [] arr = {3,3,4,5,6,7};

        System.out.println(Arrays.toString(arrayeİkiEkleme(arr)));


    }
    public static int[] arrayeİkiEkleme (int [] arr){
        int [] yeniArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i] + 2;
        }arr=yeniArr;
        return arr;
    }
}
