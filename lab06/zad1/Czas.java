package zad1;

public enum Czas {
    DZIEN,
    MIESIAC(20),
    ROK;

    private final int dni;

    Czas() {
        this.dni = 1;
    }

    Czas(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }
}
