package _22_getter_Setter_Obejct_Class_Structure.Abstract;

public class ArabaTest {

    public static void main(String[] args) {
        Araba arabaNesnesi = new Araba();
        arabaNesnesi.calistir();

        Araba baskaArabaNesnesi = new Araba(2990);
        baskaArabaNesnesi.calistir();

        System.out.println(baskaArabaNesnesi.getVarsayilanMotorHacmi());

        baskaArabaNesnesi.setVarsayilanMotorHacmi(5990);

        System.out.println(baskaArabaNesnesi.getVarsayilanMotorHacmi());
    }
}
