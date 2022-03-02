package day09_ternary_switch;

import java.util.Scanner;

public class C01_NestedİfElse {
    public static void main(String[] args) {



       /* Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın?*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamkli bir tam sayı girinizi");
        int sayi1= scan.nextInt();

        if (sayi1<1000|| sayi1>9999){
            System.out.println("lutfen 4 basamakli bir sayi giriniz");
        }else if (sayi1%5==0){//4 basamakli ve 5'e bolunebilen bir sayi
            if (sayi1 % 10 == 0) {//4basamakli, 5 ile bolunebilen ve son rakamı 0 olan bir sayı
                System.out.println("5 ile bolunebilen 4 basamaklı çift sayi");
            }else {//4 basamakli, 5 ile bölünebilen ve son rakamı 0 olan sayı
                System.out.println("5' bolunebilen tek sayi");}

        }else {//4basamakli ve 5'e bolunemeyen
            System.out.println("Tekrar deneyiniz"); }








    }
}
