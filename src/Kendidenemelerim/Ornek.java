package Kendidenemelerim;

public class Ornek {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin,
         Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
         INPUT: Dakika sayısı: 3456789
         OUTPUT : 3456789 dakika yaklaşık 6 yıl 210 gündür
         */
        int input=3456789;
        int yıl=0;
        int gun=0;



        yıl=input/(60*24*365);
        gun=input/(60*24);
        gun=gun%365;

        System.out.println("girdiginiz "+ input+" dakika yaklasik olarak "+yıl+" yil "+gun+" gundur");




    }
}
