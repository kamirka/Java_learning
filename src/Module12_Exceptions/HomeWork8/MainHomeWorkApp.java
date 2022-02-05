package Module12_Exceptions.HomeWork8;

import Module12_Exceptions.enums.Gender;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainHomeWorkApp {
    public static void main(String[] args) {


        //1. Enumy
        List<UserHomeWork> users = new ArrayList<>();
        users.add(new UserHomeWork("Ola","Testowa","mk@test.pl",36, Gender.KOBIETA));
        users.add(new UserHomeWork("Kasia","Testowa","kas@test.pl",36, Gender.KOBIETA));
        users.add(new UserHomeWork("Bartek","Testowy","bart@test.pl",36, Gender.MEZCZYZNA));
        users.add(new UserHomeWork("Mira","Testowa","mira@test.pl",36, Gender.KOBIETA));
        users.add(new UserHomeWork("Jan","Testowy","jan@test.pl",36, Gender.MEZCZYZNA));
        users.add(new UserHomeWork("Agnieszka","Testowa","aga@test.pl",36, Gender.KOBIETA));

        users.stream()
                .filter(k->k.getGender() == Gender.KOBIETA)
                .forEach(System.out::println);

        System.out.println("------------Wyjątki--------------");


        //2.Wyjątki

        List<String> namesFromFile = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/Module12_Exceptions/HomeWork8/Names.txt"));
            String line = bufferedReader.readLine();

            while(line != null){
                namesFromFile.add(line);
                line=bufferedReader.readLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("To wykona się zawsze.");
        }

        System.out.println(namesFromFile);

//-------Wyjątki AD3
//   namesFromFile.stream()
//           .filter(n->n.startsWith("h"))
//           .findAny()
//           .orElseThrow(()-> new IllegalStateException("Nie znalazłam"));

        BugHomeWork bug = new BugHomeWork("Opis","mk@test.pl", 1);
        bug.setBugPriority(6);
}
}
