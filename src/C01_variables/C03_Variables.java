package C01_variables;

public class C03_Variables {
    public static void main(String[] args) {

        String öğrenciİsmi="Melih";

        System.out.println(öğrenciİsmi);

        öğrenciİsmi="Furkan";
        System.out.println(öğrenciİsmi);
        öğrenciİsmi="Enes";

        System.out.println(öğrenciİsmi);

        //String non-primitive olduğu için biz sadece data saklamak değil
        //ekstra bazı özellikleri de kullanabiliyoruz
        //öğrneğin Tc no, okul numarası veya tel gibi
        //sayısal değeri olana ancak matematiksel bit işlemde kullanılmayan
        //değerler için de String kullanılır

        String harf="A";
        char harf2= 'A';

        //bu ikisi içinde aynı durum geçerli
        //A harfi için bir variable'i char olarak da String olarak da oluşturabiliriz
        //Eğer sadece saklayacaksak char kullanabiliriz
        //String'in özelliklerinden  istifade etmek için String olarak tanımlamak daha avantajlı olabilir.


        //bir variable declare edildikten sonra istediğimiz kadar değer değişimi yapabiliriz
        // ancak declare edilen bir variable tekrar declare edilemez

        //String isim, soyisim, Doğumyeri;
        //isim="Enes";
        //soyisim="Ayhan";
        //Doğumyeri="Isparta";
    }
}
