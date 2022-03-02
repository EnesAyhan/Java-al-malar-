package Kendidenemelerim;

import java.util.Scanner;

public class K03_Scanner02 {
    public static void main(String[] args) {
        //SORU-Kullanıcıdan yaricap isteyerek cemberin cevresini ve dairenin alanini hesaplayıp yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("çemberin yarıcapını giriniz");
        double yaricap= scan.nextDouble();
        System.out.println("Girdiginiz yaricap :"+yaricap);
        double cemberincevresi=2*3.14*yaricap;
        System.out.println("cemberin cevresi :"+cemberincevresi);
        double cemberinalani=3.14*yaricap*yaricap;

        System.out.println("Cemberin Alanı :" +cemberinalani);





    }
}
