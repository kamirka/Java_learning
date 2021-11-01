package Module8_Abstraction.computer;


import Module8_Abstraction.computer.computer.Computer;
import Module8_Abstraction.computer.computer.Laptop;
import Module8_Abstraction.computer.computer.PC;

public class MainApp {
    public static void main(String[] args) {

        //POLIMORFIZM - wiele form
        //do jednego typu zmiennej/referencji możemy przypisać wiele form
        //najwyższa klasa z której dziedziczymy, możmy przypisać różne obiekty

        //Abstrakca-nie można utworzyć obiektu z klasy abstrakcyjnej, czyli nie możemy zrobić:
        //Computer computer = new Computer("Office Computer1","HP",500,128); kiedy computer jest abstract

        Computer officeComputer1 = new PC("Office Computer1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office Computer2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office Computer3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("x Games", "Lenovo", 1000, 256, 50);
        Computer macbook = new Laptop("macbook", "Lenovo", 1000, 256, 50);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }

        ((PC) officeComputer1).showComputerName(); //Rzutowanie na inny typ - jawna zmiana, w nawiasach podaje nazwe klasy w ktorej jest ta metoda

        System.out.println(officeComputer1.volumeUP());
        System.out.println(macbook.volumeUP(95));

        System.out.println(macbook.volumeUP(6));
        System.out.println(macbook.volumeDOWN(99));
        System.out.println(macbook.volumeDOWN(4));


    }
}
