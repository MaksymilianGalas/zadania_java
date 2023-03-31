package zad2;

public class main {
    public static void main(String[] args) {
        Bookshop shop = new Bookshop("Warszawa","100m2");
        shop.getList();

        System.out.println("\n");

        Bakery raszczyk = new Bakery("Gdansk", "35m2");
        raszczyk.getList();
    }
}
