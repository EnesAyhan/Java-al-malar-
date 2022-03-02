package Kendidenemelerim;

public class K04_DataCasting02 {
    public static void main(String[] args) {
        //Onemli bir konu- Sorularda kullanılan bir konuymus

        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2); //2
        sayi2=3;
        System.out.println(sayi1/sayi2);//Sonuc yine 2'dir. Cunku integer data turu oldugu icin.
        sayi1=22;
        System.out.println(sayi1/sayi2);//7

        //Java integer sayilari birbirine bolerse sonucu integer olarak verir.
        //eger virgulden sonra kusurat varsa onu siler

        sayi1=4786;
        sayi2=10;
        System.out.println(sayi1/sayi2);//478

        double sayi3=sayi1;
        System.out.println(sayi3/sayi2); //478.6

        sayi1=4895;
        double sayi4=10;
        System.out.println(sayi1);

       // sayi1=sayi1/sayi4;        //iki farklı data sayı turunu isleme koydugumuzda
                                  //java kucuk olan data turu icin autoWidening yapar.
                                  //bu islemi dusunursek sag taraf double olur. sol taraf int olur
                                  //bu hali ile islemi gerceklestiremeyiz







    }
}
