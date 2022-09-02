package _1_variables_Data_Types.Examples;

public class C01_Variables {
    public static void main(String[] args) {

        int                not                  =           60                       ;
        //data turu  variable ismi     assigmenent sign   variable degeri   islem bitti degeri

        int  not2                =              70;
        //variable                         deger
        //java omce degeri hesaplar sonra assign istemini yapar

        //not2'yi 80 yapalım


        not2 = 90;

        //yeni bir int variable olusturalim, degeri ilk iki variable'in ortalamasi olsun

        int ort = (not + not2) /2 ;

        System.out.println(ort);
        //  " " icinde yazilan hersey metindir, Java " " icinde ne gorurse o sekilde yazdirir
        // eger bir variable'in degerini yazdirmak istiyorsaniz
        // " " olmadan variable ismini yazmalisiniz
    }
}
