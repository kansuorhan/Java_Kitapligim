package _1_variables_Data_Types.Examples;

public class C03_PrimitiveDataTypes {
    public static void main(String[] args) {



     /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
    //byte, short, integer,long, double, float veri tiplerinin
    // max ve min degerlerini yazdiralim.



        byte bytMax= Byte.MAX_VALUE;
        byte bytMin= Byte.MIN_VALUE;

        System.out.println("bytMax = " + bytMax);
        System.out.println("bytMin = " + bytMin);

        short shrMax= Short.MAX_VALUE;
        short shrMin= Short.MIN_VALUE;

        System.out.println("shrMax = " + shrMax);
        System.out.println("shrMin = " + shrMin);

        int intMax= Integer.MAX_VALUE;
        int intMin= Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

        long lonMax= Long.MAX_VALUE;
        long lonMin= Long.MIN_VALUE;

        System.out.println("lonMax = " + lonMax);
        System.out.println("lonMin = " + lonMin);

        double dobMax= Double.MAX_VALUE;
        double dobMin= Double.MIN_VALUE;

        System.out.println("dobMax = " + dobMax);
        System.out.println("dobMin = " + dobMin);

        float flMax= Float.MAX_VALUE;
        float flMin= Float.MIN_VALUE;

        System.out.println("flMax = " + flMax);
        System.out.println("flMin = " + flMin);

//Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
//Degiskenler icin anlamli isimler kullanip, yazdiralim


        float laptopFiyat= 999.99f;
        double kilometersFiyat= 34.56;
        char seviye= 'A';
        boolean dogruMu= true;

        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println("kilometersFiyat = " + kilometersFiyat);
        System.out.println("seviye = " + seviye);
        System.out.println("dogruMu = " + dogruMu);
    }

}
