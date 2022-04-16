package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        String str="   siz ne derseniz deyin, java bildigini okur.   ";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());

    }
}
