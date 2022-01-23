package Module10_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection{
    public static void main(String[] args) {
        //SET - zbiór unikalnych elementów
        //nie możemy zagwarantować kolejności dodawanych elementów

        Set<String> names = new HashSet<>();
        names.add("Mira");
        names.add("Bartek");
        names.add("Iwona");
        names.add("Paulina");
        names.add("Kasia");
        names.add("Kasia");


        System.out.println(names.size());

        for (String name:names
             ) {
            System.out.println(name);
        }

        Set<String> sortNames = new TreeSet<>(names);

        for (String name:sortNames
        ) {
            System.out.println(name);
        }

        System.out.println("-------------------");

        Set<User> users = new HashSet<>();
        users.add(new User("Ola","Testowa","o@test.pl",30));
        users.add(new User("Ola","Testowa","o@test.pl",30)); //żeby wyświetlały się tylko unikalne elementy, w klasie User należy dodać metody equals i hashCode!
        users.add(new User("Bogna","Testowa","b@test.pl",23));
        users.add(new User("Emila","Testowa","e@test.pl",13));
        users.add(new User("Joanna","Testowa","j@test.pl",41));
        users.add(new User("Magda","Testowa","m@test.pl",36));

        System.out.println(users.size());

//        for (User user: users
//             ) {
//            System.out.println(user.getFirstName()+" "+user.getLastName());
//        }

        Set<User> sortedUsers = new TreeSet<>(users);

        for (User user: sortedUsers
             ) {
            System.out.println(user.getFirstName()+" "+user.getLastName());

        }



    }
}
