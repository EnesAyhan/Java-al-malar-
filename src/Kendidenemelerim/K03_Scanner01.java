package Kendidenemelerim;


import java.util.Scanner;

public class K03_Scanner01 {
    public static void main(String[] args) {
        //Scanner oluşturmak için 3 adım takip ediyoruz
        //1. adım kendimize bir scanner oluşturmak

        Scanner scan=new Scanner(System.in);//esitliğin sağ tarafinda yeni scanner oluşturulur
                                             //ve oluşturulan bu scanner scan variable'ına assign edilir
                                             //scan variablemizin ismidir. istediğimiz ismi verebiliriz
        //2.Adım
        // Kullanıcıdan istediğimiz deger vermesi için açıklayıcı bir bilgi yazdırın

        System.out.println("Lüften isminizi giriniz");

        //3. Adım
        //kullanıcının girdigi degeri uygun bir variable oluşturup kaydedin

        String kullanıcıIsmi=scan.nextLine();
        System.out.println("kullanıcı ismi :"+kullanıcıIsmi);










    }
}
