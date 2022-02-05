package Module3_ClassesAndObjects.HomeWork2;

public class MainBug {
    public static void main(String[] args) {
    Bug first = new Bug("Niepoprawne logowanie do aplikacji", "mira@test.pl", 1);
        first.getAllInfo();
        System.out.println("Priorytet pierwszego błędu to: "+first.getBugPriority());
        first.getBugStatus();
        first.getReporterEmailAddress();
        Bug second = new Bug("Brak walidacji adresu e-mail", "ala@test.pl", 3);
        Bug third = new Bug("Niepoprawne wyświtlanie danych persolanych w panelu", "krzys@test.pl", -1);
        System.out.println("Priorytet trzeciego błędu to: "+third.getBugPriority());
        Bug fourth = new Bug("Brak komunikatu walidacyjnego", "grzes@test.pl", 2);
        Bug fifth = new Bug("Nie można zapisać zmian edycji profilu", "ola@test.pl", 5);
        fifth.bugStatus = "Otwarty";
        fifth.getBugStatus();





    }
}
