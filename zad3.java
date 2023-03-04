public class zad3 {
    public static void main(String[] args) {
        System.out.println("Miles     Kilometers");
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "         " + mile(i));
        }
    }
        public static double mile ( double km){
            return (km * 1.609);
        }
    }
