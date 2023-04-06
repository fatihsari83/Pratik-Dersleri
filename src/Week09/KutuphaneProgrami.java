package Week09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KutuphaneProgrami {
    // kitap sinıfı
    static class Kitap{
        String ad;
        String yazarAdi;
        String yayınEvi;
        int yayinYili;

        // Kitap nesnesi

        public Kitap(String ad, String yazarAdi, String yayınEvi, int yayinYili){
            this.ad=ad;
            this.yazarAdi=yazarAdi;
            this.yayinYili=yayinYili;
            this.yayınEvi=yayınEvi;
        }

        // kitap ozelliklerini yazdiran method
        public void kitapYazdir(){
            System.out.println("Kitap adı : " + ad);
            System.out.println("Yazar adi : " + yazarAdi);
            System.out.println("Yayınevi : " + yayınEvi);
            System.out.println("Kitabin baski yili : " + yayinYili);
        }
    }


    public static void main(String[] args) {

        ArrayList<Kitap> kutuphane= new ArrayList<>();

        Scanner scan= new Scanner(System.in);

        //Kutuphane giris menusu
        System.out.println("-----------------------");
        System.out.println("Yapmak istediginiz islemi seciniz.");

        System.out.println("1-Kitap Ekle");
        System.out.println("2-Kitapları Listele");
        System.out.println("3-Sistemden Cık");

        int secim=0;
        while (secim!=3);
        System.out.println("Seciminiz: ");
        secim= scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("Kitap adı: ");
                String ad= scan.nextLine();
                System.out.println("Yazar adi: ");
                String yazar= scan.nextLine();
                System.out.println("Yayınevi adi : ");
                String yayinevi= scan.nextLine();
                System.out.println("Kitap Baski Yili : ");
                int baskiYili= scan.nextInt();
        }


    }
}
