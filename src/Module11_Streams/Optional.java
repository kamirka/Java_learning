package Module11_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Optional {
    public static void main(String[] args) {
        //opakowanie obiektów
        //Optional [optional] / Optional []
        //zabezpieczenie przed nullami i zabezpieczenie przed wyjątkqami typu null pointer

        List<User> users = new ArrayList<>();
        users.add(new User("Mira","Testowa","mk@test.pl", 21));
        users.add(new User("Ola","Dowolna","o@test.pl", 13));
        users.add(new User("Kamil","Testowy","k@test.pl", 31));
        users.add(new User("Kamil","Aaaa","k@test.pl", 31));
        users.add(new User("Feliks","Jakiś","f@test.pl", 41));
        users.add(new User("Feliks","Jakiś","f@test.pl", 16));
        users.add(new User("Kasia","Słaba","ks@test.pl", 11));
        users.add(new User("Asia","Dziwna","ad@test.pl", 2));
        users.add(new User("Jakub","Testowy","jtk@test.pl", 28));

     java.util.Optional<User> max = users.stream()
                .max(Comparator.comparingInt(User::getAge));

        System.out.println(max);
        System.out.println(max.get()); //bez Optional, ale to jest niebezpieczne bo możemy dostać wyjątek "NoSuchElementExcaption" jak lista będzie pusta

        //get()
        //isPresent()
        //isEmpty()
        //orElse()
        //orElseThrow()
        //orElseGet()
        //ifPresent()
        //ifPresentOrElse()


        if(max.isPresent()){
            System.out.println(max.get());
        }else {
            System.out.println("Nie znalazłam takiego elementu");
        }
    }
}
