package day007_ifElseStatements;

public class C01_Ifstatement {
    public static void main(String[] args) {

        int a=2;
        int b=3;
         if (a==b){
             System.out.println("verilen sayılar eşit");} //sart gerçekleşmedigi icin yazdırmaz
                                                           //ama kod çalısmıs olur

         if (a>100){
             System.out.println("a 100'den buyuk");}
         if (a*b>5){
             System.out.println("sayıların carpımı 5'ten buyuk");}


         /*  HOCANIN KODLARI
         int a=10;
        int b= 20;
        if (a>b && b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }
        if (a<0)
            System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if body'sini {} icine yazmalisiniz
        // body'yi {} icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunde if cumlesi bitmis olur
        // 24.satirdaki kod 15.satirdaki if dogru olsada calisir false olsa da calisir
        System.out.println("2.satir calisti");*/

    }
}
