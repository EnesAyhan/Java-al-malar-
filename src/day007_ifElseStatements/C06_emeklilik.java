package day007_ifElseStatements;

import java.util.Scanner;

public class C06_emeklilik {
    public static void main(String[] args) {
        //kullanıcadan yasini isteyin
        //65'ten buyukse emekli olabilirsin
        //65'ten kucukse emekli olamazsın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasinizi gireniz");
        int yas= scan.nextInt();
        if (yas>65||yas>=65){
            System.out.println("emeklilik hakkiniz vardır");
        } else {
            System.out.println("emekli olamazsız");
            System.out.println(65-yas +" "+"sene daha calıismalısınız");
        }

        //if else statement'lerde iki durumdan sadece ve sadece biri calisir
        //ikisinin birden calisma ihtimali YOK
        //ikisinin birden calisma ihtimali YOK




    }
}
