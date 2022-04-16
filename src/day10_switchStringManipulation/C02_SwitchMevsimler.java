package day10_switchStringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
        //kullanicidan kacinci ay olduğunu alıp mevsimleri yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gecerli bir ay numarasi giriniz");
        int ayNo= scan.nextInt();



        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");

        }


    }
}
