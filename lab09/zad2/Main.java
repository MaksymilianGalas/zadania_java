package zad2;

public class Main {
    public static void main(String[] args) {
        Slownik<Integer, String> slownikIntString = new Slownik<>(5);
        slownikIntString.dodaj(1, "Jeden");
        slownikIntString.dodaj(2, "Dwa");
        slownikIntString.dodaj(3, "Trzy");

        System.out.println(slownikIntString.toString());  // [1->Jeden,2->Dwa,3->Trzy]

        System.out.println(slownikIntString.czyZawiera(2));  // true
        System.out.println(slownikIntString.czyZawiera(4));  // false

        System.out.println(slownikIntString.wielkosc());  // 3

        slownikIntString.dodaj(2, "Nowy Dwa");
        System.out.println(slownikIntString.toString());  // [1->Jeden,2->Nowy Dwa,3->Trzy]

        Slownik<String, String> slownikStringString = new Slownik<>(5);
        slownikStringString.dodaj("A", "Alpha");
        slownikStringString.dodaj("B", "Beta");
        slownikStringString.dodaj("C", "Charlie");

        System.out.println(slownikStringString.toString());  // [A->Alpha,B->Beta,C->Charlie]

        System.out.println(slownikStringString.czyZawiera("B"));  // true
        System.out.println(slownikStringString.czyZawiera("D"));  // false

        System.out.println(slownikStringString.wielkosc());  // 3

        slownikStringString.dodaj("B", "Nowe Beta");
        System.out.println(slownikStringString.toString());  // [A->Alpha,B->Nowe Beta,C->Charlie]
    }
}
