package day007_ifElseStatements;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {
       // Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("girilen sayı cift sayı");
        }
        if (sayi%2!=0){
            System.out.println( "girilen sayi cift degildir");
        }




    }
}

