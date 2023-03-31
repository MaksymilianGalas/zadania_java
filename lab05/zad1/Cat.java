package zad1;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }
    public String makeSound(){
        String sound = "miau miau";
        return name + " robi " + sound + " oraz jest koloru " + color+ "\n";
    }
}
