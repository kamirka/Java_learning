package Module6_StaticFieldsAndMethods;

import Module6_StaticFieldsAndMethods.utils.StringUtils;
import Module6_StaticFieldsAndMethods.utils.WeekUtils;

public class MainUser {
    public static void main(String[] args) {
        User u1 = new User("Bartek", "Testowy", "bartek@test.pl", 17); //u1 jest referencją to obiektu
        User u2 = new User("Kasia", "Testowa", "kasia@test.pl", 18);
        User u3 = new User("Asia", "Test", "asia@test.pl", 19);
        User u4 = new User("Mira", "Tes", "mira@test.pl", 20);

        //statyczne pola należaą do klasy a nie do obiektu!
        //pole statyczne jest polem danej klasy i aby się do niego dostać należy podać "nazwę klasy . pole"
        System.out.println(User.getUserCounter());

        // StringUtils stringUtils = new StringUtils(); nie musimy tworzyć obiektów jeśli chcemy utworzyć metode pomocniczą np do formatowania tekstu
        String bartektekst = StringUtils.getFormattedText("Bartektekst");

        System.out.println(bartektekst);


        String mira = StringUtils.getFormattedText("Mira");
        System.out.println(mira);


        System.out.println(WeekUtils.MONDAY);

        // WeekUtils.MONDAY = "Sunday"; nie mozna nadpisać pola final

        //   System.out.println(WeekUtils.MONDAY);

    }
}
