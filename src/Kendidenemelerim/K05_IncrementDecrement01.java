package Kendidenemelerim;

public class K05_IncrementDecrement01 {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10); //30
        //BU satırda atama yapılmadı
        //Sayinin 10 fazlasi yazdirildi

        System.out.println(sayi); //20

        //Eger sayida atama yapmaz isek artırma veya azaltma kalıcı olmaz

        System.out.println(sayi=sayi+=10); //30
        //burada hem atama yapiyoruz hem de yazdırma işlemini yapiyoruz

        System.out.println(sayi);//30

        System.out.println(sayi+=10); //40 ÖNEMLİ= hem atama yaptık hem yazdırdık
        System.out.println(sayi); //40

        //bir variable'ın degerini kalıcı olarak artırmak veya azaltmak icin assignment sartttır.

        System.out.println("25.Satır :"+ sayi++ ); //40
        System.out.println("26.satır :"+ sayi); //41


        System.out.println("29.Satır :"+ ++sayi); //42
        System.out.println("30.Satır :"+ sayi);  //42





    }
}
