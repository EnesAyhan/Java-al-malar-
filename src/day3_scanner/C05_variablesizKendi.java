package day3_scanner;

public class C05_variablesizKendi {
    public static void main(String[] args) {
        //x=55 y=80 bu sayıların yerlerinini 3. bir variable olmadan değiştir.

        int x=55;
        int y=80;
        System.out.println("swaptan once x:"+ x + " y:"+y);
        x=x+y; y=x-y; x=x-y;
        System.out.println("swaptan sonra x:"+x + " y:"+y);
    }
}


