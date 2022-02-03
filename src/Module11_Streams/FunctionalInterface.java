package Module11_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterface {
    //Predicate - pobiera jedną wartość i zwraca boolean  np. filter
    //Cunsumer - pobiera jedną wartość i nic nie zwraca  np. sout
    //Suppliar - dostarcza wartość np.


        public static void main(String[] args) {

            List<User> users = new ArrayList<>();
            users.add(new User("Mira","Testowa","mk@test.pl", 21));
            users.add(new User("Ola","Dowolna","o@test.pl", 13));
            users.add(new User("Kamil","Testowy","k@test.pl", 31));
            users.add(new User("Kamil","Aaaa","k@test.pl", 31));
            users.add(new User("Feliks","Jakiś","f@test.pl", 41));
            users.add(new User("Feliks","Jakiś","f@test.pl", 16));
            users.add(new User("Kasia","Słaba","ks@test.pl", 11));
            users.add(new User("Kasia","Słaba","ks@test.pl", 11));
            users.add(new User("Kasia","Słaba","ks@test.pl", 11));
            users.add(new User("Kasia","Słaba","ks@test.pl", 11));
            users.add(new User("Kasia","Słaba","ks@test.pl", 11));
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

            String kasia = users.stream()
                    .map(User::getFirstName)
                    .filter(s->s.equals("Kasia"))
                    .findFirst()
                    .orElse("Nie ma użytkownika o imieniu Kasia");

            System.out.println(kasia);

            Integer age = users.stream()
                    .map(User::getAge)
                    .max(Integer::compareTo)
                    .orElse(-1);

            System.out.println(age);

            User bartek = users.stream()
                    .filter(user -> user.getFirstName().startsWith("B"))
                    .findFirst()
                    .orElseGet(() -> new User("BartekGet","TestowyGet","bartekTestowy@test.pl", 45));
            //zwraca wartość jeśli lista nie zawiera szukanego obiektu

            System.out.println(bartek);

            //----------ifpresent()--------------------
            users.stream()
                    .filter(user -> user.getFirstName().startsWith("M"))
                    .findFirst()
                    .ifPresent(user -> System.out.println(user));
            //pobiera i nic nie zwraca

            //----------ifpresentOrElse()--------------------
            users.stream()
                    .filter(user -> user.getFirstName().startsWith("I"))
                    .findFirst()
                    .ifPresentOrElse(user -> System.out.println(user),()-> System.out.println("Nie ma takiego użytkownika!"));//pobiera i nic nie zwraca

            users.stream()
                    .filter(user -> user.getFirstName().startsWith("I"))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("Na liście nie ma usera, który zaczyna się na literę I"));
            //zwraca wyjątek jeśli nie ma

        }
}
