package Kendidenemelerim;

import java.util.Locale;
import java.util.Scanner;

public class K09_ifElseIfgunsorusu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun adını giriniz");
        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("pazartesi")){
            System.out.println("Paz");
        }else if (gunIsmi.equals("sali")){
            System.out.println("Sal");
        }else if (gunIsmi.equals("carsamba")){
            System.out.println("Car");
        }else if (gunIsmi.equals("persembe")){
            System.out.println("Per");
        }else if (gunIsmi.equals("cuma")){
            System.out.println("Cum");
        }else if (gunIsmi.equals("cumartesi")){
            System.out.println("Cts");
        }else if (gunIsmi.equals("pazar")){
            System.out.println("Paz");
        }else {
            System.out.println("gecerli bir gun giriniz");
        }






    }
}
