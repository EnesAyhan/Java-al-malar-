package day3_scanner;

import java.util.Scanner;

public class C06_scanKendiOrnek
{
    public static void main(String[] args) {
        // Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        //      Isim – soyisim : Mehmet Bulutluoz
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ismnizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("isminiz:"+isim+" soyisminiz:"+soyisim);
    }
}
