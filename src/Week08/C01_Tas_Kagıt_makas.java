package Week08;

import java.util.Random;
import java.util.Scanner;

public class C01_Tas_Kagıt_makas {

    public static void main(String[] args) {

        // Bilgisayara karsi tas kagit makas oyunu oynayin
        // 5 puana ilk ulasan oyunu kazanir

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoise = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;
        do {

        System.out.println("Asagıdakilerden birini seç: \n 1-Tas    2- Kagıt    3- Makas");

        // kullanicinın secim yapmasını istiyoruz
        userChoise = scan.nextInt();

        // Bilgisayarin secim yapmasını saglayin

        compChoise = random.nextInt(3) + 1; // burada (0-3) arasında deger secer.
        // biz de +1 ile 1,2,3 den birini secmemizi sagladık

        if (userChoise == 1 && compChoise == 2) {
            System.out.println("Bilgisayarin sectigi : "+ compChoise);
            System.out.println("Kagıt tası sarar ---  Bilgisayar +1 ");
            comp++;
            System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
            System.out.println(" ");
        } else if (userChoise==1 && compChoise==3) {
            System.out.println("Bilgisayarin sectigi : "+ compChoise);
            System.out.println("Tas makası kırar  --  Oyuncu +1");
            user++;
            System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
            System.out.println(" ");
        } else if (userChoise==2 && compChoise==1) {
            System.out.println("Bilgisayarin sectigi : "+ compChoise);
            System.out.println("Kagıt tası sarar ---  Oyuncu +1 ");
            user++;
            System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
            System.out.println(" ");
        } else if (userChoise==2 && compChoise==3) {
            System.out.println("Bilgisayarin sectigi : "+ compChoise);
            System.out.println("Makas kagıdı keser -- Bilgisayar +1");
            comp++;
            System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
            System.out.println(" ");
        }else if (userChoise==3 && compChoise==1) {
            System.out.println("Bilgisayarin sectigi : "+ compChoise);
            System.out.println("Tas makası kırar -- Bilgisayar +1");
            comp++;
            System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
            System.out.println(" ");
        }else if (userChoise==3 && compChoise==2) {
            System.out.println("Bilgisayarin sectigi : "+ compChoise);
            System.out.println("Makas kagıdı keser -- Oyuncu +1");
            user++;
            System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
            System.out.println(" ");
        }else {
            System.out.println("Berabere, Kimse puan alamadi!");
            System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
        }
        }while(user !=5 && comp !=5);
            // kazanani gosterelim
            if (user>comp){
                System.out.println("-------Tebrikler Siz Kazandiniz-------");
            }else {
                System.out.println("-------Maalesef Kaybettiniz!--------- ");
            }scan.close();
        }
    }

