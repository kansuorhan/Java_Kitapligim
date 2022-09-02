package _2_java_String_Data_Types.Abstract;

public class replace {
    public static void main(String[] args) {

       /*
       String tipinin bir başka özelliği de değer olarak atanmış
       metin içerisinde istediğimiz bir karakteri yine istediğimiz
       bir karakterle değiştirebiliyor olmamızdır.
        */

        String stringDeger = "Hello Java, Hello World";
        System.out.println(stringDeger.replace("e", "i")); //Hillo Java, Hillo World
        System.out.println(stringDeger.replace("Hello", "Merhaba")); //Merhaba Java, Merhaba World


    }
}
