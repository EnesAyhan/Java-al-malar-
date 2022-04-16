package day10_switchStringManipulation;

public class C03_concat {
    public static void main(String[] args) {
        //concatination yapmak icin 2 yolumuz var
        //concat methodu veya + yolunu kullanabiliriz.

        String str1="Java";
        String str2="Candır";
        //Java Candir yazdiralim

        System.out.println(str1+""+str2);
        String cumle=str1.concat(str2); //JavaCandır

        cumle=str1.concat("").concat(str2);
        System.out.println(cumle);
        boolean dogruMu=false;
        cumle=cumle.concat(String.valueOf(dogruMu));
        System.out.println(cumle);
        //concat methodu icine sayı veya boolean bir değer yazsak?
        //concat methodu String parametre ister
        //String dısında bir data turu yazdıgınızda onu String hale getirmelisiniz
        //cumle=str1.concat(5+""); gibi olmalı


    }
}
