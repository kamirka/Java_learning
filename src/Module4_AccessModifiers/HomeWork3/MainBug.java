package Module4_AccessModifiers.HomeWork3;

import Module4_AccessModifiers.HomeWork3.model.Bug;

public class MainBug {
    public static void main(String[] args) {
     Bug first = new Bug ("Niepoprawne logowanie do aplikacji","mira@test.pl", 1);
//        first.getAllInfo();
//        System.out.println("Priorytet pierwszego błędu to: "+first.getBugPriority());
//        first.getBugStatus();
//        first.getReporterEmailAddress();


        System.out.println(first.getBugDescription());

        first.setBugDescription("1fdasfasdf23456789");
        System.out.println(first.getBugDescription());
        first.setBugDescription("1456789");
        System.out.println(first.getBugDescription());

        System.out.println("------------------");
        first.getReporterEmailAddress();
        first.setReporterEmailAddress("mk@test.pl");
        first.getReporterEmailAddress();
        first.setReporterEmailAddress("mkest.pl");

        System.out.println("------------------");

        System.out.println(first.getBugPriority());
        first.setBugPriority(5);
       System.out.println(first.getBugPriority());
        first.setBugPriority(6);
    }

}
