package Java101;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.Notunuzu giriniz: ");
        float not1 = input.nextFloat();
        System.out.print("2.Notunuzu giriniz:");
        float not2 = input.nextFloat();
        float ort = (not1 + not2)/2;
        System.out.print("Ortalamanız: ");
        System.out.println(ort);
        int x;
        if(ort>60){
            x =1;
        }
        else{
           x = 2;
        }
      switch (x){
          case 1:
              System.out.println("Tebrikler Geçtiniz");
              break;
          case 2:
              System.out.println("Maalesef Kaldınız");
              break;
      }

    }
}
