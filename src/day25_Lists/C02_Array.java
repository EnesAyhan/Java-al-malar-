package day25_Lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        //verilen bir array'den istenen bir elementi silip(kaç tane varsa) kalanları
        //yeni bir array olarak yaziran bir method olusturun
        int arr[] = {3, 4, 2, 3, 5, 7, 3, 0, 5, 2, 4};
        int istenmeyeneleman = 3;
        istenmeyenElemaniSil(arr, istenmeyeneleman);
    }

    public static void istenmeyenElemaniSil(int[] arr, int istenmeyeneleman) {
        //1- istenmeyen element sayisini bulalim
        //bu adimin sebebi bir sonraki olusturacagimiz arrayin length'ini belirlemek
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenmeyeneleman) {
                sayac++;
            }

        }
        //2-yeni arrayi olusturalim
        int arryeni[] = new int[arr.length - sayac];
        //3-Eski Array'den uygun olan elementleri yeni arraye tası
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyeneleman) {
                arryeni[index] = arr[i];
                index++;
            }
            //4-yeni array'i yazdiralim
            System.out.println(Arrays.toString(arryeni));
        }
    }

}
