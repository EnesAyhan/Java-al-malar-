package day3_scanner;

public class C01_variables {
    public static void main(String[] args) {
        String okulIsmi="yıldız koleji";
        System.out.println(okulIsmi);
        char ilkharf;
        ilkharf='k';
        System.out.println(ilkharf);

        int sayı1=10,sayı2=20;
        System.out.println(sayı1+sayı2);
         String isim="Enes";
         String soyisim="Ayhan";
        System.out.println("isminiz :"+isim);
        System.out.println("soyisminiz :"+soyisim);



        //2 farklı tamsayı data türünde 2 variable oluşturun bunların toplamını yazın

        short sayi3=20;
        double sayi4=30;
        System.out.println(sayi3+sayi4);
        System.out.println("iki sayının toplamı:"+ (sayi3+sayi4));

        //char data türündeki değişkenler matematiksel işlemlerde kullanılırsa
        //o char değerinin ASC||(aski) değeri ile toplanır

        char harf='a';
        int sayı5=20;
        System.out.println(sayı5+harf);
    }
}
