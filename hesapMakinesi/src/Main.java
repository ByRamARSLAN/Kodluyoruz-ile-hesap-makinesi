import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("Toplam için 1'i\nÇıkarma için 2'yi\nÇarpma için 3'ü\nBölme için4'ü tuşlayın.");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println(n1 + " ve " + n2 +" Sayısının toplamı : " + (n1 + n2) );
                break;
            case 2:
                System.out.println(n1 + " ve " + n2 +" Sayısının farkı : " + (n1 - n2) );
                break;
            case 3:
                System.out.println(n1 + " ve " + n2 +" Sayısının çarpımı : " + (n1 * n2) );
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("Bir sayı sıfıra bölünemez..!");
                    break;
                }
                System.out.println(n1 + " Sayısının " + n2 +" sayısına bölümü : " + (n1 / n2) );
                break;
            default:
                System.out.println("Geçersiz bir sayı girdiniz!");

        }


    }
}