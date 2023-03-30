package Week08;

import java.util.Arrays;

public class C04_Arrayde_Elemanlari_Yana_Kaydirma {
    public static void main(String[] args) {
        /*
    Verilen bir array’deki tum elementleri bir saga kaydirip,
    sondaki elementi de basa tasiyacak bir method olusturun,
    array’i yeni haliyle kaydedin.
     */
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(elemntleriSagakaydir(arr)));


    }
    public static int[] elemntleriSagakaydir (int [] arr){
        int [] yeniArr = new int [arr.length];

        yeniArr [0]= arr[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {

            yeniArr [i+1] = arr[i];

            //arr [arr.length-1-i] = arr[arr.length-2-i];
        }arr=yeniArr;

        return arr;
    }


}
