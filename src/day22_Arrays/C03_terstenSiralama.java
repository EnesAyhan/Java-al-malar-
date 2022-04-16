package day22_Arrays;

import java.util.Arrays;

public class C03_terstenSiralama { public static void main(String[] args) {
    // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
    //  //sadece yaziran ama kaydetmeyen method
    int arr[]= {3,5,6,1,9,45,25,4,9,0};
    terstenSiralaYazdir(arr);
}
    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]//Array'de Tersten Yazdirma Methodu yoktur
        int tersArr[]= new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]= arr[arr.length-1-i] ;
        }
        System.out.println(Arrays.toString(tersArr));
    }
}
