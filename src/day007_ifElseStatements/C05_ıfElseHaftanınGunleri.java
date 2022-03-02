package day007_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_ıfElseHaftanınGunleri {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String gunIsmi= scanner.next().toUpperCase(Locale.ROOT);
        //toUpperCase yazdığımız için if icerisindeki karakterleri de buyuk yazmamız gerekiyor


        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }


    }
}
