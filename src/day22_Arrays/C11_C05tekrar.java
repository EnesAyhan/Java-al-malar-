package day22_Arrays;

public class C11_C05tekrar {
    public static void main(String[] args) {
        // Verilen array'de istenen bir elementin var olup olmadigini true/false yazdirarak
        // gosteren bir method olusturun
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=8;
        istenenElemanVarmi(arr,istenenSayi);



    }

    private static void istenenElemanVarmi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (istenenSayi==arr[i]){
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);

    }
}
