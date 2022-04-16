package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        //kac String verilirse verilsin
        //iclerinden en uzun olanini yazdiran bir method olusturun
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Cengizhan";
        //Yazilan argument sayisi sabitse her zamanki gibi method olusturulur
        //Ancak argument sayisinin degisme ihtimali varsa
        //o zaman varargs kullanilir
        enUzunKelime(str1,str2,str3,str4);

    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";
        for (String each:str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("En Uzun Kelime: "+enUzunStr);

    }
}
