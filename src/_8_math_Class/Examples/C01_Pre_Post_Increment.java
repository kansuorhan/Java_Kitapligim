package _8_math_Class.Examples;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;

        int sayi2= sayi1 + 1;

        sayi2 +=5;

        System.out.println(sayi2);

        // buraya kadar problem yok
        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */
        //pre de önce artma sonra yazdırma olur
        //post da önce yazdırma sonra arttırma olur


        int sayi3= sayi2++; // 1- sayi2 bir artirilacak
        // 2- sayi2 degeri, sayi3'e atanacak

        /*
        ++ veya -- variable'dan sonra olursa buna post....
        bu durumda o satirda yapilan iki islemden
        artirma veya azaltma islemi sonuncudur
         */

        System.out.println("sayi3 : " + sayi3);
        System.out.println("sayi2 : " + sayi2);

        int sayi4=++sayi1; // 1- sayi1 bir artirilacak
        // 2- sayi1 degeri, sayi4'e atanacak

        /*
        eger ++ veya -- variable'dan once ise buna pre.... denir
        bu durumda o satirda yapilan iki islemden oncelikli olan
        artirma veya azaltmadir
         */

        System.out.println("sayi4 : " + sayi4);
        System.out.println("sayi1 : " + sayi1);


    }
}
