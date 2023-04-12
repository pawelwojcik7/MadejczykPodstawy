package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] tablica = {1, 2, 3, 4, 5, 6};
        Integer wynik1 = Metody.ilePar(tablica);
        Integer[] wynik = Metody.nieParzyste(tablica);
        System.out.println("ile par : " + wynik1);
        Arrays.stream(wynik).forEach(e -> System.out.println(e));
    }
}
