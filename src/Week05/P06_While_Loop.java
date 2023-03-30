package Week05;

public class P06_While_Loop {
    public static void main(String[] args) {

        /*
        While loop kullanarak 2 basamakli 7 ile bolunebilen
        pozitif tamsayilari yazdirin.
         */

        int sayi=10;
        String sayilar ="";

        while (sayi <100){
            if (sayi%7==0){
                sayilar+=sayi + ",";
            }
            sayi++;
        }
        System.out.println(sayilar.substring(0,sayilar.length()-1));
    }
}
