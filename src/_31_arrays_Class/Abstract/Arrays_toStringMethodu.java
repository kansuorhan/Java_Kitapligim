package _31_arrays_Class.Abstract;

import java.util.Arrays;

public class Arrays_toStringMethodu {


    public static void main(String[] args)
    {
        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz
        //Diziyi Belirli Bir Değerle ile Doldurmak için Arrays.fill()
        Arrays.fill(liste,5);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz
        //Diziyi Belirli Bir değerle, belirli bir aralıkta doldurma
        Arrays.fill(liste2,2,5,6);
        System.out.println(Arrays.toString(liste2));
    }

        /*
        OUTPUT:
        [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
        [1, 4, 6, 6, 6, -3, 6, 2, -49, 52]
         */
}
