package Kendidenemelerim;

import java.util.Scanner;

public class K03_Scanner03 {
    public static void main(String[] args) {
        //SORU- Kullanıcıdan ismini alarak sadece baş harfini yazdırın.

        Scanner scan=new Scanner(System.in);

        System.out.println("İsminizi Giriniz");
        char ilkHarf= scan.next().charAt(0);
        //ÖNEMLİ:
        //charAt(index) parametre olarak yazdığımız index'deki charı bize getirir
        //String'de index 0 dan başlar.
        //charAt(1) yazarsak 2. harfi getirir.



        System.out.println("İsminizin ilk harfi :" +ilkHarf);








    }
}
