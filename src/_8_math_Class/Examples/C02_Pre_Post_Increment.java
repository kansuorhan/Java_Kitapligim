package _8_math_Class.Examples;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("preincrement : " + ++sayi);

        System.out.println("postincrement : " + sayi++);

        System.out.println("post-increment'den sonra : " + sayi);

        //pre de önce artma sonra yazdırma olur//
        //post da önce yazdırma sonra arttırma olur//

        sayi ++;

        System.out.println(sayi);

        ++sayi;
        System.out.println(sayi);
    }
}
