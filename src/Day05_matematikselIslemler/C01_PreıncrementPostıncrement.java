package Day05_matematikselIslemler;

public class C01_PreıncrementPostıncrement {
    public static void main(String[] args) {
        int sayi=10;
        //bu sayiyi artırmak istersek
        sayi++;
        System.out.println(sayi); //11


        sayi++;
        System.out.println("pre-ıncrementten önce"+ sayi); //12

        //eger 11. ve 12. satirda yaptigim islemi tek satirda yaparsam
        //java iki islemden önce hangisini yapacagini bilmek ister.
        //Once artirir sonra yazdirirsak java yeni degeri yazdirir
        //ama once yazdirir sonra artirirsak, bu durumda eski deger yazdırılır

        System.out.println("pre-increment satirinda :"+ ++sayi); //13
        System.out.println("pre-incrementtan sonra :"+ sayi); //13

        System.out.println("post-increment satırında :"+ sayi++); //13
        System.out.println("post-incrementtan sonra :"+ sayi); //14









    }
}
