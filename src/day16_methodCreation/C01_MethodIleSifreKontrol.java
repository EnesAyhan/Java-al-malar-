package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        String sifre="Asdf12345a";
        boolean ilkHarfKonrol=ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol=sonHarfKontrolEt(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);
        if (ilkHarfKonrol && sonHarfKontrol && boslukKontrol &&uzunlukKontrol){
            System.out.println("Sifreniz kaydedildi");
        }else{
            System.out.println("İslem Basarisiz, tekrar deneyin");}



    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonucu=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonucu=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        return uzunlukKontrolSonucu;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonucu=false;

        if (!sifre.contains(" ")){
           boslukKontrolSonucu=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        return boslukKontrolSonucu;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf=sifre.charAt(sifre.length()-1);
        boolean sonHarfSonuc=false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }

        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if (ilkHarf>= 'A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else{
            System.out.println("Sifrenizin ilk harfi buyuk olmalı");
        }
        return ilkHarfSonuc;
    }


}

