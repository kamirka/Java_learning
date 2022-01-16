package Module9_Interface.Boxing;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Byte b; //dla typu prostego byte mamy klasę Byte
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        Boolean bl;


        int number = 10; //tu utworzyliśmy zmienną typu prostego i przypisaliśmy jej wartość 10

        //możemy też wywołać konstruktor z klasy Integer i jako parametr w konstruktorze przekazać wartość 10

        Integer intNumber = new Integer (10); //tu utworzyliśmy zmienną referencyjną z klasy Integer i wypisalismy jej zmienną
        //jak widać Integer jest oznaczony jako "deprecated" czyli przestarzałe i zaraz przestanie działać
        //możemy zamiast tego wywołać metodę statyczną:




        Integer intNumber2 = Integer.valueOf(10);
        //zamieniliśmy tak typ prosty na typ referencyjny - i to nazywa się auto boxing
        //ale możemy to zrobić w prosty spobób:
        Integer intNumber3 = 10;


        int newNumber = intNumber2.intValue();
        //a tu zamieniliśmy typ referencyjny na typ prosty = czyli auto unboxing



        System.out.println(intNumber);
        System.out.println(intNumber2);

        List<Integer> numbers = new ArrayList<>(); //tu też musimy zamienić na klasę Integer

    }
}
