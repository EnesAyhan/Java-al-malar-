package day007_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_haftaici_sonu {
    public static void main(String[] args) {
        /*Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
  Ornek:  gun=Pazar output = “Hafta sonu”
 gun=Sali output = “Hafta ici”
 *** String icin equals method’unu kullanin*/
        //gun cumartesi veya pazar ise haftasonu
        //diger günler olursa haftaici olacak
        //String case sensitive'dir. Pazar,pazar,PAzar hepsi farkılıdır
        //bu durumda String methodlarından yardım alırız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmı= scan.next().toLowerCase(Locale.ROOT);

                                //kullanıcı nasıl yazarsa yazsın biz kucuk harfe ceviriyrz.
        if (gunIsmı.equals("pazar")||gunIsmı.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }
        if (gunIsmı.equals("pazartesi")||gunIsmı.equals("salı")||gunIsmı.equals("carsamba")||
        gunIsmı.equals("persembe")|| gunIsmı.equals("cuma")){
            System.out.println( "girdiğiniz gun haftaici");
        }
        /* HOCANIN KODLARI
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase(); // kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyorz
        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
        gunIsmi.equals("carsamba")||gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");
        }*/





    }
}
