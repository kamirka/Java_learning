package Module10_Collections;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //Kolekcja - zbiór elementów tego samego typu
        //List, Set, Queue, Map,

        //Klasa ArrayList dziedziczy po interfejsie List!
        //dobrą praktyką zatem jest: TYp referencji to List i dopiero później implementacja ArrayList

        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();

        names.add("Mira");
        names.add("Paula");
        names.add("Kasia");
        names.add("Ola");

        names1.add("Krzyś");
        names1.add("Zdzich");

        System.out.println(names);

        for (String name:names) {
            System.out.println(name);
        }


        //names.remove(0);
        //names.remove("Ola");

        String name = names.get(1);
        System.out.println(name);


        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mira"));

        names.addAll(names1);
        System.out.println(names);


       // names.removeAll(names);
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);
        System.out.println("--------------------------");

        List<User> users = new ArrayList<>();

        users.add(new User("Mira","Testowa","mk@test.pl",36));
        users.add(new User("Kasia","Nieznana","mk@test.pl",16));
        users.add(new User("Paula","Testowa","mk@test.pl",10));
        users.add(new User("Krzyś","Testowa","mk@test.pl",20));

        for (User user:users) {
            System.out.println(user.getFirstName());
        }

        Collections.sort(users, Comparator.comparing(User::getFirstName));
        //nie wie jak ma posortować obiekt za pomocą jakiego pola.
        //zatem po nazwie kolekcji, po przecinku musimy podać za pomocą jakiego pola ma być posortowane, czyli
        //Interfejs Comparator i z tego interfejsu musimy wywołać metodę statyczną Comparing i z nawiasu podajemu referencję do metody

        System.out.println(users);
        System.out.println("--------------------------");
        Collections.sort(users, Comparator.comparingInt(User::getAge));
        System.out.println(users);
        System.out.println("--------------------------");
        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed()); //posortowane od największej do najmniejszej
        System.out.println(users);

    }
}
