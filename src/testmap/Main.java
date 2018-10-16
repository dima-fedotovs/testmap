package testmap;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> translations
                = new TreeMap<>(Comparator.reverseOrder());

        translations.put("two", "два");
        translations.put("one", "один");
        translations.put("home", "дом");
        translations.put("mouse", "мышь");

        System.out.println(
                translations.containsKey("home"));

        System.out.println(
                translations.size());

        System.out.println(translations.get("home"));

        for (String k : translations.keySet()) {
            System.out.printf("%s -> %s\n", k, translations.get(k));
        }

        translations.remove("one");

        System.out.println("After removal");
        for (String k : translations.keySet()) {
            System.out.printf("%s -> %s\n", k, translations.get(k));
        }

    }
}
