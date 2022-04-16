package day27_constructor;

public class ZZ {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit="Benzin";
    int yil;
    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araclar max 240 km hiz yapar");
        } else if(yakit.equals("Dizel")){
            System.out.println("Dizel araclar max 260 km hiz yapar");
        }
    }



}
