package Module3_ClassesAndObjects;

public class MainUser {
    public static void main(String[] args) {
        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Testowy";
        bartek.email = "bartek@test.pl";
        bartek.age = 17;
        bartek.isAdult = false;
        System.out.println(bartek.firstName);
        bartek.getFullName();
        bartek.getAllInfo();
        System.out.println(bartek.getUserAge());
        int userAge = bartek.getUserAge(); //najedz na metodę i wciśnij alt +enter
        System.out.println(userAge);
        boolean userAdult = bartek.isUserAdult();
        System.out.println("Czy Baretek jest dorosły: "+userAdult);
        bartek.greetings("Bartek");

        int i = bartek.yourAgePlus10(17);
        System.out.println(i);


        //zaznacz tekst i kliknij alt + J aby edytować więcej pozycji
        User mira = new User(); //wywołanie konstruktora przez utworzenie obiektu
        mira.firstName = "Mira";
        mira.lastName = "Testowa";
        mira.email = "mira@test.pl";
        mira.age = 36;
        mira.isAdult = false;
        System.out.println(mira.firstName);
        mira.getFullName();
        System.out.println(mira.yourAgePlus10(mira.age));
        mira.greetings(mira.firstName, mira.lastName); //po najechaniu na metode i wciśnięciu ctrl przenośi nas do metody w klasie User


        User anna = new User("Anna", "Nowak","anna@test.pl", 25);
        System.out.println("Anna firstname: "+anna.firstName);

    }
}
