package day22_Arrays;

import java.util.Arrays;

public class C09_C03tekrar {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
        //sadece yaziran ama kaydetmeyen method
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdiranMethod(arr);

    }


    public static void terstenSiralaYazdiranMethod(int[] arr) {
        Arrays.sort(arr); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {//[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
            tersArr[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tersArr));
    }
}
