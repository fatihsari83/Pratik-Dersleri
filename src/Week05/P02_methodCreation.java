package Week05;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class P02_methodCreation {
    static  String duzenlist="";

    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen adinizi girin :");
        String name= scan.nextLine();
        System.out.println("Lutfen ikinci adinizi giriniz yoksa enter tusuna basiniz");
        String name2= scan.nextLine();
        System.out.println("Lutfen soyisminiz girin :");
        String surname= scan.nextLine();

        System.out.println(isimSoyisimYazdir(name,name2,surname));
    }

    public static String isimSoyisimYazdir(String name, String name2, String surname) {
        name=name.toUpperCase().charAt(0)+ name.substring(1).toLowerCase();
        name2=name2.toUpperCase().charAt(0)+ name2.substring(1).toLowerCase();
        surname=surname.toUpperCase().charAt(0) + surname.substring(1).toLowerCase();
        duzenlist=name + " " + name2 + " " + surname;
        return duzenlist;
    }
}
