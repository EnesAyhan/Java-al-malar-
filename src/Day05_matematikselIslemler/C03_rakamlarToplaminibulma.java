package Day05_matematikselIslemler;

import java.util.Scanner;

public class C03_rakamlarToplaminibulma {
    public static void main(String[] args) {

        //kullanicidan aldığınız 4 basamaklı bir sayinin b
        //basamklarının rakamlar toplamini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamkli bir tamsayı giriniz");

        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlartoplamı=0;

        //1.adim r=0 rt=0 sayi=7532
        rakam=sayi%10;
        rakamlartoplamı+=rakam; //rt=2
        sayi/=10; //753

        //2.adim
        rakam=sayi%10;
        rakamlartoplamı+=rakam; //2+3=5
        sayi/=10; //75

        //3.adim
        rakam=sayi%10;
        rakamlartoplamı+=rakam; //5+5=10
        sayi/=10; //7

         //4.adim
        rakam=sayi%10;
        rakamlartoplamı+=rakam;//10+7=17
        sayi/=10; //0

        System.out.println("rakamlartoplamı:"+ rakamlartoplamı);




    }
}
