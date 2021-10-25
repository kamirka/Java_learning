package Module7_Inheritance;

import Module7_Inheritance.computer.Laptop;
import Module7_Inheritance.computer.PC;

public class MainApp {
    public static void main(String[] args) {

        //IS A - jest czymś - DZIEDZICZENIE
        //HAS A - posiada coś - KOMPOZYCJA

        PC officeComputer = new PC("Office Computer","HP",500,128);
        Laptop gamingLaptop = new Laptop("x Games", "Lenovo",1000,256,50);

//        officeComputer.switchOn(); //nadpisywanie występuje tylko przy dziedziczeniu
//        gamingLaptop.switchOn();
        System.out.println(officeComputer.getState());
        System.out.println(gamingLaptop.getState());

        gamingLaptop.setBatteryLevel(0);
  //     officeComputer.setPower(true);

     //   officeComputer.showComputerName();
        officeComputer.switchOn();
        gamingLaptop.switchOn();
    }
}
