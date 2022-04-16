package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {
    public static void main(String[] args) {
        //verilen bir listede tekrar eden sayilari sadece 1 kere yazdirma
        //bir method olusturun
        //orn:{1,3,5,3,5,6,1,7}
        //outout{1,3,5,6,7}

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar);


    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizLİst = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizLİst.contains(sayilar.get(i))) {
                //bastaki unlem isareti icermiyorsa anlamı verir.
                tekrarsizLİst.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsizLİst);

    }
}
