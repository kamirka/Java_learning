package Module9_Interface.Composition;

import Module9_Interface.Composition.Ram;
import Module9_Interface.Composition.Hdd;

public class MainApp {
    public static void main(String[] args) {
        //1. Is A - coś jest czymś - dziedziczenie
        //2. Has A - posiada coś, składa się z czegoś - kompozycja


        Hdd hdd = new Hdd ("Samsung", 526);
        Ram ram = new Ram ("AAA", 128);


        Computer mac = new Laptop("Mac", "PRO", hdd, ram, 100);
        Computer mac1 = new Laptop("Mac", "PRO", hdd, new Ram ("ABC", 256), 100);
        //dwa sposoby budowania obiektów- w drugim obiekt bezpośrednio wrzucamy do konstruktora i nie musimy jego bezpośrednio tworzyć

        System.out.println(mac.getRam().getSize());
        System.out.println(mac1.getRam().getSize());

    }
}
