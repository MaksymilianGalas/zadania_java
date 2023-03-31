package zad1;

public class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color);
    }

    public String makeSound(){
        String sound = "hau hau";
        return name + " robi " + sound + " oraz jest koloru " + color + "\n";
    }
}
