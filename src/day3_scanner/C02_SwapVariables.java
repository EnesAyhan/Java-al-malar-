package day3_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {
        /*1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
 Orn  : sayi1=10 ve sayi2=20;
  kod calistiktan sonra
  sayi1=20 ve sayi2=10*/

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swap'dan once sayi1: " + sayi1 + ", sayi2 : "+ sayi2);

        //1.adımda boş bir variable oluşturup sayı1'i ona atayalım

        int temp=sayi1;

        //2.adım sayı1'e  yeni değerini atayalım

        sayi1=sayi2;
        //3. adım tempe yedeklediğimiz sayı1 değerini atayalım
        sayi2=temp;

        System.out.println("Swap'dan once sayi1: " + sayi1 + ", sayi2 : "+ sayi2);
    }
}
