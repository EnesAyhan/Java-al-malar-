package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("D");//[D]
        harfler.add("M");//[D,M]
        harfler.add(1, "T");//[D,T,M]
        harfler.add(0, "T");
        System.out.println(harfler);//[T, D, T, M]
        harfler.contains("T");
        System.out.println(harfler.contains("T"));//true

        List<String> karakterler = new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        harfler.containsAll(karakterler);//harfler listesi karakterler listesini içeriyor mu methodu
        System.out.println(harfler.containsAll(karakterler));//içeriyor mu sorusu olduğu için sıra önemli değil
        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler));//false verir. karakterler listesi
                                                            // harfler listesi içerisinde yeralmıyor



    }
}
