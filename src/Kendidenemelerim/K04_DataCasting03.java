package Kendidenemelerim;

public class K04_DataCasting03 {
    public static void main(String[] args) {
        //Explicit Narrowin(Manuel Daraltma)

        int sayi1=879;
        double sayi2=10;
        double sayi3=sayi1/sayi2;
        System.out.println(sayi3); //87.9

        int sayi4=(int) (sayi1/sayi2); //87.9
                                        //deger double variable integer
                                        //yani variable daha dar dolayısıyla java bunu otomatik olarak yapmaz
                                        // java sorumlulu ustlenmemizi ister
                                        //sag tarafa yazdığımı (int) sorumluluk bende demektir.
        System.out.println(sayi4);

        //İsi biraz zorlastirioruz

        int sayi5= 140;
        //byte sayi6=sayi5;  //sag tarafa yazıdıgımız deger> sol tarafa yazılan degerden
                            //bu durumda java sorumluluk almamızı ister
                            //sag tarafa yazdıgımız (byte)  sorumluluk bizde demektir.
        byte sayi6=(byte) (sayi5);
        System.out.println(sayi6); //-116

        //Byte -128 ile 127 sınırları içerisinde olduğu için ust sınırı 13 birim geçtigi icin
        //-128'den devam eder ve sonuc -116 olur.

        sayi5=280;
        sayi6=(byte) (sayi5);
        System.out.println(sayi6); //24
                                    //sayi6=(byte) (sayi5); bu alana casting denir.
                                    //her degisikligin yapıldıgı her yerde casting yapılır

        sayi5=400;
        sayi6=(byte) (sayi5);
        System.out.println(sayi6);






    }
}
