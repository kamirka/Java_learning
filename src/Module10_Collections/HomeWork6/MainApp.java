package Module10_Collections.HomeWork6;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Pierwszy bug","mk@wp.pl",1));
        bugs.add(new Bug("Drugi bug","m@wp.pl",2));
        bugs.add(new Bug("Drugi bug","m@wp.pl",2));
        bugs.add(new Bug("Trzeci bug","amk@wp.pl",1));
        bugs.add(new Bug("Czwarty bug","bmk@wp.pl",4));
        bugs.add(new Bug("Piąty bug","cmk@wp.pl",5));


        System.out.println(bugs.size());
        for (Bug bug: bugs
             ) {
            System.out.println(bug.getBugDescription());
        }
        System.out.println("-----------------");

        Set<Bug> uniqueBugs = new HashSet<>(bugs);

        System.out.println(uniqueBugs.size());
        for (Bug uniqueBug: uniqueBugs
             ) {
            System.out.println(uniqueBug.getBugDescription());
        }
        System.out.println("-----------------");

        Set<Bug> orderedUniqueBugs = new TreeSet<>(bugs);
        System.out.println(orderedUniqueBugs.size());
        for (Bug orderedUniqueBug: orderedUniqueBugs
             ) {
            System.out.println(orderedUniqueBug.getBugDescription());
        }

    }
}
