package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C10_Deneme {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[3]=3;
        System.out.println(Arrays.toString(arr));
        arr[0]=4;
        arr[4]=5;
        System.out.println(Arrays.toString(arr));
        int arrYeni[]=new int[10];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        int sayi[][]= new int[4][3];
        sayi[0][0]=2;
        sayi[0][1]=3;
        sayi[0][2]=4;
        sayi[1][0]=6;
        sayi[1][1]=5;
        sayi[1][2]=4;
        sayi[2][1]=4;
        System.out.println(Arrays.deepToString(sayi));

    }
}
