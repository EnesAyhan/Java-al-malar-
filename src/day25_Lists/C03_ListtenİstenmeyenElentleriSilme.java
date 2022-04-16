package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListtenİstenmeyenElentleriSilme {
    public static void main(String[] args) {
        //verilen bir array'den istenen bir elementi silip(kaç tane varsa) kalanları
        //yeni bir array olarak yaziran bir method olusturun
        int arr[] = {3, 4, 2, 3, 5, 7, 3, 0, 5, 2, 4};
        int istenmeyeneleman = 3;
        istenmeyenElemaniSilVeYazdir(arr, istenmeyeneleman);
    }

    private static void istenmeyenElemaniSilVeYazdir(int[] arr, int istenmeyeneleman) {
    List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!=istenmeyeneleman){
                yeniList.add(arr[i]);
            }

        }
        System.out.println(yeniList);

    }
}
