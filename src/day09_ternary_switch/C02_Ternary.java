package day09_ternary_switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //ternary ile yapilan butun islemler if-Else ile de yapilabilir
        //ternary'i tercih etme sebebi yapinin basit ve anlasilir olasidir
        //ternary icinde kompleks yapilar olmaz, sonuca goturen basit islemlerdir
        //kullaniciden bir tamsayi alip tek mi çift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayı giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayi çift");
        } else {
            System.out.println("sayi tek");
        }
        System.out.println(sayi % 2 == 0 ? "Sayi cift" : "Sayi tek");


    }
}
