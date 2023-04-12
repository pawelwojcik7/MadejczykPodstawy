package org.example;

public class Metody {

    public static Integer[] nieParzyste(Integer[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (czyParzyste(tablica[i])) tablica[i] = tablica[i] + 1;
        }
        return tablica;
    }

    public static Integer ilePar(Integer[] tablica) {
        int m = 0;
        for (int i = 0; i < tablica.length - 1; i++) {
            if (tablica[i] < tablica[i + 1]) m++;
        }
        return m;
    }

    private static boolean czyParzyste(Integer liczba) {
        if (liczba % 2 == 0) return true;
        else return false;
    }

}
