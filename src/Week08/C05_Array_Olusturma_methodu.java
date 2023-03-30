package Week08;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Array_Olusturma_methodu {
    public static void main(String[] args) {
        /*
        Kullanicidan array’in boyutunu ve elementlerini
        alip array’i olusturan ve bize
        donduren bir method olusturun.
         */
        System.out.println(Arrays.toString(kullaniciyaArrayYaptir()));;
    }

    public static int[] kullaniciyaArrayYaptir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediğimiz Array in boyutunu giriniz");

        int lenght= scan.nextInt();
        int [] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.print("Dizinin " + (i+1) + ". elemanını girin: ");
            arr[i]= scan.nextInt();
        }return arr;
    }
}
