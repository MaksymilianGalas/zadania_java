package zad2;

public class Bakery extends Shop{
    String[] products1 = new String[3];
    public Bakery(String address, String size) {
        super(address, size);
    }

    public String list() {
        products1[0] = "milk";
        products1[1] = "cookie";
        products1[2] = "coffe";
        return null;
    }
    public void getList(){
        getInformation();
        list();
        for(int i=0; i<products1.length;i++){
            System.out.println(products1[i]);
        }
    }

}
