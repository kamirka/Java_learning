package Module12_Exceptions;

import Module12_Exceptions.enums.WeekDays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws IOException {

        //WYJĄTKI - sytuacje wyjątkowe

        //1. Dwa typy wyjątków - musimy i nie musimy łapać
        //2. Łapanie wyjątków
        //3. Rzucanie wyjątków
        //4. Dodanie wyjątku do sygnatury metody
        //5. Tworzenie własnych wyjątków


        //AD1. Musimy łapać - Exception
        //FileNotFoundException();
        //IOException();

        //AD2. Nie musimy łapać - RuntimeException
        //IllegalStateException();
        //IllegalArgumentException();
        //NullPointerException();
        //IndexOutOfBoundsException();
        //UnsupportedOperationException();

//---------Rozwiązanie pierwsze: ja decyduję które wyjątki obsłużyć
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/Module12_Exceptions/test.txt")); //żeby odczytać dane z pliku pomoże nam klasa BufferedReader
//            String line = bufferedReader.readLine();
//
//            while(line != null){
//                System.out.println(line);
//                line=bufferedReader.readLine();
//            }
//
//        } catch (FileNotFoundException e) { //nie jest dobrą praktyką łapanie wszystkiego do "Exception",najlepiej obsługiwać wsztskie wyjątki osobno
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            System.out.println("To wykona się zawsze. np zamknięcie połaczenia z bazą dancyh");
//        }

        
//-----------Rozwiązanie drugie - w klasie main nie jest dobrą praktyką rozwiązanie drugie
// nie chcemy obsługiwać go w kodzie try/catch, tylko chcemy go rzucić do klasy wyższej

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"))) {
//
//        }


//----------NullPointerException
//        Bug bug = new Bug("Description","mk@test.pl",1);
//        System.out.println(bug.getBugDescription());
//
//        bug = null;
//        System.out.println(bug.getBugDescription());


//-----------IndexOutOfBoundsException
//        List<String> names = new ArrayList<>();
//        names.add("Mira");
//        System.out.println(names.get(1));


//-----------IllegalStateException
//        List<String> names = new ArrayList<>();
//        names.add("Mira");
//        names.add("Bartek");
//        names.add("Ola");
//        names.add("Kasia");
//
//        names.stream()
//                .filter(c->c.startsWith("A"))
//                .findFirst()
//                .orElseThrow(()-> new IllegalStateException("Nie ma imienia zaczynającego się na 'A'"));


//------------Własny wyjątek ----IllegalEmailFormatException

        User user = new User("M","K","mk@test.pl",36);
        user.setEmail("mk_test.eu");



        //-----------enumy
        System.out.println(WeekDays.PONIEDZIALEK.getName());

        if("poniedziałek".equalsIgnoreCase(WeekDays.PONIEDZIALEK.getName())){ //nie ma różnicy mała czy wielka litera
            System.out.println("Jest ok");
        } else {
            System.out.println("Nie jest ok");
        }

    }
}
