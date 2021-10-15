package Module4_AccessModifiers;

import java.util.Locale;

public class MethodsOnString {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        //porównanie equals boolean
        System.out.println(str1.equals(str2));

        //porównanie equals bez wielkości literat
        System.out.println(str1.equalsIgnoreCase(str2));

        //zamień stringa na wielkie litery
        String s1 = str1.toUpperCase();
        System.out.println(s1);

        //zamień stringa na małe litery
        String s2 = str1.toLowerCase();
        System.out.println(s2);

        //sprawdź czy zaczyna się od jakiegoś tekstu
        boolean startsWith=str1.startsWith("He");
        System.out.println(startsWith);

        //sprawdź czy kończy się na jakoąś literę/y
        boolean endsWith=str1.endsWith("lo");
        System.out.println(endsWith);

        //sprawdź czy zawiera jakiś tekst/znaki
        System.out.println(str1.contains("ll"));

        //sprawdza czy tekst jest pusty
        System.out.println("".isBlank()); //zwraca true -> ignoruje spacje i taby
        System.out.println("".isEmpty()); //zwraca true -> nie ignoruje spacji!

        //podmiana tekstu
        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);

        String replaceAll = str2.replaceAll("l", "x");
        System.out.println(replaceAll);

        //wyciągnięcie konkretnych znaków liczony od 0
        String substring = str1.substring(1, 4);
        System.out.println(substring);

        String textWithWhiteSpaces = "    text with white spaces    ";

        //długość stringa
        System.out.println(textWithWhiteSpaces.length());

        //usunąć spacje przed i po teksćie
        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());

    }
}
