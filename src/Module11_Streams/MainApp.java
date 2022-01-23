package Module11_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        //strumienie wartości
        //są używane w połączneiu z kolekcją

        //są dwa typy metod:
        //1.metody pośrednie, które zwracają nowy stream (wykonują jakąś operację)
        //np:
        //filter - filtrowanie elementów
        //map - przekształcanie elementów

        //2.metoda terminalna - wykonywana jako ostatnie - nie zwraca nowego streamu, tylko wartość lub listę wartosci
        //np.:
        //foreach
        //min | max | sum
        //anyMatch | allMatch | noneMatch
        //count
        //collect - zbieranie elementów

        List<String> names = new ArrayList<>();
        names.add("Mira");
        names.add("Bartek");
        names.add("Feliks");
        names.add("Michał");
        names.add("Kamila");
        names.add("Franek");
        names.add("Ola");
        names.add("Filip");
        names.add("Paulina");

        names.stream()
                .filter(str -> str.startsWith("F"))
                .filter(str -> str.contains("k"))
                .filter(str -> str.endsWith("s"))
                .forEach(str -> System.out.println(str));
        //wyrażenie lambda, to jest zwykła funkcja, ktora coś zwraca

        //f(x)=x+2
        //f(2) = 2+2 =4

        //funkcja(str) = str.startsWith("F")
        //(str) = str.startsWith("F")
        //str = str.startsWith("F")
        //str -> str.startsWith("F")   ->jeśli str ma tylko jeden parametr to znak "równa się" zamieniamy na strzałkę

        names.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        names.stream()
                .filter(str -> str.length() <= 4)
                .map(str -> "Short name: "+ str.toUpperCase())
                .forEach(str -> System.out.println(str));

        long count = names.stream()
                .filter(str -> str.length() <= 4)
                .count();
        System.out.println(count);

        //Metody sprawdzające:

        boolean anyMatch = names.stream()
                .anyMatch(s -> s.contains("a"));
        System.out.println(anyMatch);

        boolean allMatch = names.stream()
                .allMatch(s -> s.length() > 2);
        System.out.println("All contains 'a' letter:  " +allMatch);

        boolean noneMatch = names.stream()
                .noneMatch(s -> s.endsWith("ski"));
        System.out.println("None ends with 'ski': "+noneMatch);
        System.out.println("----------------");

        List<String> fNames = names.stream()
                .filter(s -> s.startsWith("F"))
                .collect(Collectors.toList());
        System.out.println(fNames);

    }
}
