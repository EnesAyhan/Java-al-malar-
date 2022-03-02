package Day05_matematikselIslemler;

public class C02_Pre_Post_incerement {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++; //once sayi2'ye deger atancak
                        //sonra sayi1'in degeri artacak

        System.out.println(sayi1 +"," +sayi2+ "," +sayi3);

        sayi3=++sayi1; //Once sayi1'in degeri artacak sonra sayi3'e atama yapılacak
                        //yani önce sayi1 12 olacak sonra bu deger sayi3'e atanacak

        System.out.println(sayi1+","+sayi2+","+sayi3);

        System.out.println(sayi3++); //12(once ilk degeri yazar sonra artırır)
        System.out.println(sayi3);  //13

        System.out.println(--sayi3); //12(once azaltıp sonra yazar)




    }
}
