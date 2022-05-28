package Zadanie1;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();

        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("INDEX " + arrayList.indexOf(arrayList.get(i)) + " LICZBA: " + arrayList.get(i));
        }

        long time2 = System.currentTimeMillis();
        System.out.println("CZAS: " + (time2 - time1));
    }
}