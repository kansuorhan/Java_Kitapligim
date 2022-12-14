package _32_multi_Dimensional_Arrays.Abstract;

public class KarmasikDiziler {



    /*
    Çok boyutlu dizilerin bir özelliğide karmaşık yapıda tanımlanabilmesidir.
    Karmaşık dizilere örneğimizi int veri tipi üzerinden yazacağımız kod
    parçasıyla vereceğiz.
     */

    private void multiDimensionalArrayTest() {
        int[][] numberArray = {
                {0},
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9},
        };
    }

    private void intArrayPrinter(int[][] intArray) {
        int rowSize = intArray.length;
        for (int row = 0; row < rowSize; row++) {
            int columnSize = intArray[row].length;
            for (int column = 0; column < columnSize; column++) {
                System.out.println("int[" + row + "][" + column + "]: " + intArray[row][column]);
            }
        }

    }

    /*
    Yukarıdaki örneğin kodunu inceledikten sonra çıktısını incelediğimizde
    rahat bir şekilde hangi indekse hangi değerin atadığını görebiliriz.
    Burada dikkat edilmesini gereken nokta, çok boyutlu dizi de sütun
    sayısının değişken olduğudur. Önceki çok boyutlu String dizi örneğimizde
    sütun sayısı değişmezken bu örnekte rastgele sütun sayıları ile işlem
    yapılmıştır. Yalnız Java’da çok boyutlu dizilerde değişken tanımlaması
    yaparken satır sayısını sabit verip sütun sayısını vermeden işlem
    yapabilirken, sütun sayısını sabit verip satır sayısını vermeden
    tanımlama yaptığımızda hata ile karşılaşacağımızı aklımızın bir
    köşesine yazmamız gerekmektedir. Kısa bir kod parçasıyla açıklamak
    gerekirse;

    int[][] foo = new int[3][]; //doğru tanımlama
    int[][] foo1 = new int[][3]; // hatalı tanımlama
    int[][] foo2 = new int[][]; //hatalı tanımlama

    Java’da çok boyutlu diziler tanımlanırken mutlaka initialize edilmelidir.
    Aksi takdirde geliştirme anında hata ile karşılaşılır.

     */








}






