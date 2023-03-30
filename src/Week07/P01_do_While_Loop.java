package Week07;

public class P01_do_While_Loop {
    public static void main(String[] args) {

        // 'k' harfinden 't' harfine kadar harfleri yazdirin.

        char ilkHarf= 'k';

        do {
            System.out.print(ilkHarf + "-");
            ilkHarf++;
        }while (ilkHarf <='t');


    }
}
