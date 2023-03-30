package Week3;

import java.util.Scanner;

public class P08_String_Manipulation {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //ismi daha uzun ise, isim ve soyismi
        // ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin soyisim daha uzun ise ismi
        // ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi girin :");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi girin :");
        String soyisim= scan.nextLine();

        if (isim.length()>soyisim.length()){
            isim= isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase();
            soyisim= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyisim.length()).toLowerCase();

            System.out.println(isim + " " + soyisim);

        }
        if (isim.length() <soyisim.length()){
            isim= isim.substring(0,1).toUpperCase()+isim.substring(1, isim.length()).toLowerCase();
            soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1, soyisim.length()).toUpperCase();
            System.out.println(isim + " " + soyisim);
        }



    }
}
