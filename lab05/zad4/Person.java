package zad4;
public class Person {
    private String name;
    private String surname;
    private String address;
    private String city;
    private String country;

    public Person(String name, String surname, String address, String city, String country) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("Osoba: %s %s, Adres: %s, %s, %s", name, surname, address, city, country);
    }
}
