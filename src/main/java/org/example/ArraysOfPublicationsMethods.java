package org.example;

public class ArraysOfPublicationsMethods {

    public static void showPublications(Publication[] publications) {
        for (int i = 0; i < publications.length; i++) {
            publications[i].display();
        }
    }

    public static void showPublicationsTitles(Publication[] publications) {
        for (int i = 0; i < publications.length; i++) {
            System.out.println(publications[i].getTitle());
        }
    }

    public static Double calculateTotalIncome(Publication[] publications) {

        double m = 0;
        for (int i = 0; i < publications.length; i++) {
            m = m + publications[i].getPrice() * publications[i].getQuantity();
        }

        return m;
    }

}
