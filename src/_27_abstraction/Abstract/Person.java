package _27_abstraction.Abstract;

public class Person {

    /*
    Person.java sınıfı içerisinde bir kişiye ait isim, soyisim ve
    id bilgileri tutulmaktadır.
     */

    private int id;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}