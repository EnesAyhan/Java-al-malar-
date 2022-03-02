package Kendidenemelerim;

public class K04_DataCasting01 {
    public static void main(String[] args) {

        boolean dogruMu=true;
        //String str=dogruMu; //sol String sag boolean olduğu için kabul etmiyor.

        byte sayi1=44;
        System.out.println(sayi1); //44

        short sayi2=sayi1; //esitligin solu shırt, sagı byte olmasına java itiraz etmiyor.
                           //Deger olarak atanan data türü variable turunden kucuk oldugundan java sorub yapmaz.
        System.out.println(sayi2); //44

        double sayi3=sayi2;
        System.out.println(sayi3); //44.0





    }
}
