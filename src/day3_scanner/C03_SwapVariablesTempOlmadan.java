package day3_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {
           /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
       int swapp1=10;
       int swapp2=20;
        System.out.println("swap öncesi sayı 1:"+swapp1 +" sayı2:"+swapp2);

        swapp1=swapp2+swapp1; swapp2=swapp1-swapp2; swapp1=swapp1-swapp2;
        System.out.println("swap sonrası sayı 1:"+swapp1 + " sayı2:"+swapp2);
    }
}
