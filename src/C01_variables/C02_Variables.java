package C01_variables;

public class C02_Variables {

    public static void main(String[] args) {
        //java çalışmaya main methodtan başlar
        //sonra yukarıdan aşağı. soldan sağa çalışır.
        //eğer istersek bir variable'ı önce declare edip sonra atayabiliriz
        //java değer ataması yapmadığımız bir variable oluşturmamıza itiraz etmez
        //ancak değer ataması yapılana kadar onu kullanmaya izi vermez

        String okulIsmi;
        okulIsmi="yıldız koleji";

        System.out.println(okulIsmi);

        okulIsmi="star koleji";
        System.out.println(okulIsmi);

        okulIsmi="java koleji";
        System.out.print(okulIsmi);
        System.out.print(okulIsmi); //java koleji

        //println ile print arasındaki fark println dediğinizde yazdırma işleminden sonra alt satıra geçerken;
        //sadece print dediğimizde yazdırma işleminden sonra alt satıra geçmez


    }
}
