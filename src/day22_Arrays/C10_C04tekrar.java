package day22_Arrays;

import java.util.Arrays;

public class C10_C04tekrar {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip bize donduren method olusturun
        //tersten siralayarak kaydetme islemi yapıldı
        int arra[]= {3,5,6,1,9,45,25,4,9,0};
        arra=terstenSiralama(arra);
        System.out.println(Arrays.toString(arra));

    }

    private static int[] terstenSiralama(int[] arra) {
    Arrays.sort(arra);
        int tersArr[]=new int[arra.length];
        for (int i = 0; i <arra.length ; i++) {//[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
            tersArr[i]=arra[arra.length-1-i];
        }

        return tersArr;
    }
}
