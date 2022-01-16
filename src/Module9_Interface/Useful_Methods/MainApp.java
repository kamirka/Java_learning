package Module9_Interface.Useful_Methods;

public class MainApp {
    public static void main(String[] args) {
        User mira = new User ("Mira", "Testowa","mk@test.pl", 20);
        System.out.println(mira); // tu wyśweitla się tylko referencja do obiektu, chyba że w klasie User dodamy metodę toString


        User mira1 = new User ("Mira", "Testowa","mk@test.pl", 20);
        System.out.println(mira.equals(mira1));
    //powinno być true, a jest false, bo porównaliśmy same referencje, a nie zawartość
    }
}
