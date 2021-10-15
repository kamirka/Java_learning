package Module4_AccessModifiers;

public class MainUser {
    public static void main(String[] args) {
        User bartek = new User("Bartek","Testowy","bartek@test.pl",17);
        bartek.getAllInfo();

        int userAge = bartek.getUserAge(); //najedz na metodę i wciśnij alt +enter
       // System.out.println(userAge);
        boolean userAdult = bartek.isUserAdult();
        System.out.println("Czy Baretek jest dorosły: "+userAdult);
        bartek.greetings("Bartek");

        int i = bartek.yourAgePlus10(17);
      //  System.out.println(i);

        System.out.println(bartek.getEmail());

        bartek.setEmail("bk@test.ru");
        System.out.println(bartek.getEmail());

    }
}
