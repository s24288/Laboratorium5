package Zadanie3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Coffee {
    public static void main(String[] args) {
        List<String> coffeeType = new ArrayList<>();
        coffeeType.add("espresso");
        coffeeType.add("latte");
        coffeeType.add("cappuccino");
        coffeeType.add("mocha");
        coffeeType.add("auLait");
        coffeeType.add("macchiato");

        System.out.println(coffeeType);

        Iterator<String> iterator = coffeeType.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        for (String s : coffeeType) {
            System.out.println(s.toUpperCase(Locale.ROOT));
        }

        for (int i = 0; i < coffeeType.size(); i++) {
            String s = coffeeType.get(i);
            System.out.println(s.substring(0, 4));
        }
    }

}
