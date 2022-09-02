package _2_java_String_Data_Types.Abstract;

public class substring_charAt {
    public static void main(String[] args) {

        //Farklı bir String veri tipi tanımlama yöntemi
        String stringDeger = new String("Hello World, Hello Java");
        System.out.println(stringDeger); // Hello World, Hello Java

        //String değerden bir karakter çekme
        char charDeger = stringDeger.charAt(9);
        System.out.println(charDeger); // l

        //Substring kullanımı
        String substringDeger = stringDeger.substring(12);
        System.out.println(substringDeger); //Hello Java

        //Substring kullanımı
        String substringDeger1 = stringDeger.substring(12,18);
        System.out.println(substringDeger1); // Hello







    }
}
