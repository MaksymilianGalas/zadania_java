package zad2;

public class Bookshop extends Shop{
    String[] products = new String[3];

    public Bookshop(String address, String size) {
        super(address, size);
    }

    public String list() {
        products[0] = "book";
        products[1] = "pencil";
        products[2] = "pencil case";
        return null;
    }
    public void getList(){
        getInformation();
        list();
        for(int i=0; i<products.length;i++){
            System.out.println(products[i]);
        }
    }
}