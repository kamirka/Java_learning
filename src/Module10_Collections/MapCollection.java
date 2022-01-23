package Module10_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
    public static void main(String[] args) {
        //Mapa = zbiór klucz + wartość
        //klucz zawsze musi być unikalny => jeśli dodamy, to stara wartość zostanie nadpisana przez nową

        Map<Integer, String> names = new HashMap<>();

        names.put(2, "Ola");
        names.put(22, "Basia");
        names.put(4, "Paulina");
        names.put(15, "Iwona");
        names.put(30, "Kasia");
        names.put(11, "Mira");

        System.out.println(names);

        Map<Integer,String> sortedNames = new TreeMap<>(names);
        System.out.println(sortedNames);

        Map<Integer, String> orderedNames = new LinkedHashMap<>(names);

        System.out.println(orderedNames);

        for (Map.Entry<Integer,String> entry : names.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }
}
