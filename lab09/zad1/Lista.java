package zad1;

public class Lista<E> {
    private E[] lista;
    private int rozmiar;
    private int iloscElementow;

    public Lista(int rozmiar) {
        this.rozmiar = rozmiar;
        lista = (E[]) new Object[rozmiar];
        iloscElementow = 0;
    }

    public boolean dodaj(E element) {
        if (iloscElementow < rozmiar) {
            lista[iloscElementow] = element;
            iloscElementow++;
            return true;
        }
        return false;
    }

    public boolean czyZawiera(E element) {
        for (int i = 0; i < iloscElementow; i++) {
            if (lista[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int zwrocIndeks(E element) {
        for (int i = 0; i < iloscElementow; i++) {
            if (lista[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int zwrocOstatniIndeks(E element) {
        for (int i = iloscElementow - 1; i >= 0; i--) {
            if (lista[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public E zwrocElement(int indeks) {
        if (indeks >= 0 && indeks < iloscElementow) {
            return lista[indeks];
        }
        return null;
    }

    public boolean podmienElement(int indeks, E element) {
        if (indeks >= 0 && indeks < iloscElementow) {
            lista[indeks] = element;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("[");
        for (int i = 0; i < iloscElementow; i++) {
            buffer.append(lista[i]);
            if (i < iloscElementow - 1) {
                buffer.append(",");
            }
        }
        buffer.append("]");
        return buffer.toString();
    }
}
