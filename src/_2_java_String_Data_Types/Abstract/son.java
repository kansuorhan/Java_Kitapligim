package _2_java_String_Data_Types.Abstract;

public class son {
    public static void main(String[] args) {

        String stringDeger = "Hello Java, Hello World";

        String[] stringDegerler = stringDeger.split(" ");

        System.out.println(stringDegerler[0]); //Hello
        System.out.println(stringDegerler[1]); //Java,
        System.out.println(stringDegerler[2]); //Hello
        System.out.println(stringDegerler[3]); //World

        /*
        Yukarıda ki örnekte “Hello Java, Hello World” metnini boşluk
        ” ” olan yerden iki ayrı string e bölerek split işlemi
        gerçekletirmiş oluyoruz. Bu özellikler günlük hayatta kod yazarken
        bir çok kez işinize yarayacaktır. Aşağıda ki methodlar burada
        örneklendirmediğimiz fakat String tipi ile en çok kullanılan
        methodlardan bazıları aşağıdaki gibidir;

         */

        /*
charAt(int index)	String içerisinde belirtilen index
değerindeki karakter değeri döner.
lenght()	String değerin uzunluğunu döner.
substring(int beginIndex)	Verilen beginIndex değerindeki
indexten sonrasını döner.
substring(int beginIndex, int endIndex)	Verilen begin index ile endIndex
değeri rasındaki bölümü döner.
equals(Object another)	Object olarak verilen değerin varolan
değerle eşitliğini kontrol eder.
true|false döner.
isEmpty()	String değer boş mu dolumu kontrolü
yapar. true|false döner.
concat(String str)	String değerin sonuna farklı bir
string değer eklemek için kullanılır.
replace(char old, char new)	String metin içerisinde belirtilen
oldChar değerlerini newChar
değeri ile değiştirir.
         */

        /*
        Yukarıdaki methodlardan concat() string’leri birleştirmek için
        kullanılır, fakat string birleştirme yani bir stringin peşine
        başka bir string ekleme işlemini aşağıdaki şekildede yapabiliriz.
         */

        String a ="Hello Java,";
        String b ="Hello World";

        System.out.println(a+b);

        String c = a+b;
        System.out.println(c);

        System.out.println("Hello Java," + "Hello World");

        /*
        Hello
        Java,
        Hello
        World
        Hello Java,Hello World
        Hello Java,Hello World
        Hello Java,Hello World
         */








    }
}
