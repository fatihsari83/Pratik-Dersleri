package Week3;

import java.util.Scanner;

public class P07_1_Switcg_statement {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // 1 - Kullanicidan ay numarasini alip
        // ay ismini yazdirin

   //     System.out.println("Lutfen merak ettiginiz ayin numarasini giriniz :");
   //     int ay = scan.nextInt();
   //     switch (ay){
//
   //         case 1:
   //             System.out.println("Ocak");
   //             break;
   //         case 2:
   //             System.out.println("Subat");
   //             break;
   //         case 3:
   //             System.out.println("Mart");
   //             break;
   //         case 4:
   //             System.out.println("Nisan");
   //             break;
   //         case 5:
   //             System.out.println("Mayis");
   //             break;
   //         case 6:
   //             System.out.println("Haziran");
   //             break;
   //         case 7:
   //             System.out.println("Temmuz");
   //             break;
   //         case 8:
   //             System.out.println("Agustos");
   //             break;
   //         case 9:
   //             System.out.println("Eylul");
   //             break;
   //         case 10:
   //             System.out.println("Ekim");
   //             break;
   //         case 11:
   //             System.out.println("Kasim");
   //             break;
   //         case 12:
   //             System.out.println("Aralik");
   //             break;
   //         default:
   //             System.out.println("Gecersiz bir deger girdiniz :");

        // Kullanicidan ay numarasi alıp mevsimi yazdirin

       //System.out.println("Lutfen mevsimini ogrenmek istediginiz ayin numarasini giriniz :");
    //   int ayNo= scan.nextInt();
    //   switch (ayNo) {
    //       case 1:
    //       case 2:
    //       case 12:
    //           System.out.println("Mevsim : Kıs");
    //           break;
//
    //       case 3:
    //       case 4:
    //       case 5:
    //           System.out.println("Mevsim : Ilkbahar");
    //           break;
//
    //       case 6:
    //       case 7:
    //       case 8:
    //           System.out.println("Mevsim : Yaz");
    //           break;
//
    //       case 9:
    //       case 10:
    //       case 11:
    //           System.out.println("Mevsim : Sonbahar");
    //           break;
//
    //       default:
    //           System.out.println("Gecersiz bir deger girdiniz");
    //
        //




        // Kullanıcıdan yılı ve ay numarasını alıp
        // o yıldaki o ayda kaç gün olduğunu yazdırın

        System.out.println("Bilgi istediginiz yili giriniz : ");
        int year= scan.nextInt();
        System.out.println("Gun sayisini merak ettiginiz ayin kacıncı ay " +
                "oldugunu giriniz");
        int ayNo= scan.nextInt();

        int numdays=0;
        switch (ayNo){
            case 1: case 3: case 5: case 7: case 8: case 12:
                numdays=31;
                System.out.println("Girdiginiz aydaki gun ");
                break;

            case 4: case 6: case 9: case 11:
                numdays =30; break;

            case 2:
                numdays=((year%4==0 && (year%100==0) || year%400==0)?28:29); break;

            default:
                System.out.println("Gecersiz ay");
        }
        System.out.println("Girdiginiz ");

       }
    }



