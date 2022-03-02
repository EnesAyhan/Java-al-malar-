package Kendidenemelerim;

import java.util.Scanner;

public class K09_ifElseStatementharfmi {
    public static void main(String[] args) {

        //girilen karakterin harf olup olmadıgını bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char karakter=scan.next().charAt(0);

         if ((karakter>='A'&& karakter<='Z') ||(karakter>='a'&&karakter<='z')){
             System.out.println("girdiginiz karakter bir harf");
         }else {
             System.out.println("girdiginiz karakter bir harf degildir");
         }












    }
}
