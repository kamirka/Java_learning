package Module11_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
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

        List<User> userList = users.stream()
              // .sorted(Comparator.comparing(user -> user.getFirstName())) //można zamienić lambdę na referencję do metody = uproszczenie:
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName).thenComparing(User::getAge))
                .collect(Collectors.toList());

        users.stream()
                .sorted(Comparator.comparing(User::getFirstName))
                .forEach(System.out::println); //referencja do metody


        System.out.println("---------");
        for (User user: userList
             ) {
            System.out.println(user.getFirstName()+" "+ user.getLastName()+" "+ user.getAge());
        }


    }
}
