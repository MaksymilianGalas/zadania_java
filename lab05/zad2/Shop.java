package zad2;

public class Shop {
    String address;
    String size;
    public Shop(String address, String size){
        this.address = address;
        this.size = size;
    }

    public String getInformation(){
        System.out.println(address + "  " + size);
        return null;
    }
}
