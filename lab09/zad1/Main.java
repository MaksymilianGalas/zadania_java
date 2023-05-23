package zad1;

public class Main {
    public static void main(String[] args) {
        Lista<String> listaString = new Lista<>(5);
        listaString.dodaj("A");
        listaString.dodaj("B");
        listaString.dodaj("C");
        listaString.dodaj("D");

        System.out.println(listaString.toString());  // [A,B,C,D]

        System.out.println(listaString.czyZawiera("B"));  // true
        System.out.println(listaString.czyZawiera("E"));  // false

        System.out.println(listaString.zwrocIndeks("C"));  // 2
        System.out.println(listaString.zwrocIndeks("E"));  // -1

        System.out.println(listaString.zwrocOstatniIndeks("D"));  // 3
        System.out.println(listaString.zwrocOstatniIndeks("E"));  // -1

        System.out.println(listaString.zwrocElement(1));  // B
        System.out.println(listaString.zwrocElement(5));  // null

        System.out.println(listaString.podmienElement(0, "X"));  // true
        System.out.println(listaString.toString());  // [X,B,C,D]

        System.out.println(listaString.podmienElement(5, "Y"));  // false
    }
}
