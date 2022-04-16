package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C09_C06Tekrar {
    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir method olusturun
        int arrr[]= {3,5,7,5};
        int eklencekElement=1;
        arrr=arrayeElemanEkleme(arrr,eklencekElement);
        System.out.println(Arrays.toString(arrr));

    }

    private static int[] arrayeElemanEkleme(int[] arrr, int eklencekElement) {
        int yeniArraya[]=new int[arrr.length+1];
        for (int i = 0; i <arrr.length ; i++) {
            yeniArraya[i]=arrr[i];

        }
        yeniArraya[yeniArraya.length-1]=eklencekElement;


        return yeniArraya;
    }
}
