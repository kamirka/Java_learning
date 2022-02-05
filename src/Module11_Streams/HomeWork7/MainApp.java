package Module11_Streams.HomeWork7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class MainApp {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.add(new Laptop("Mac Pro", "Pro 1", new Hdd("WC1", 512), new Ram("Test 1", 128), 10));
        computers.add(new Laptop("Samsung", "Pro 2", new Hdd("WC2", 256), new Ram("Test 2", 256), 80));
        computers.add(new Laptop("HP", "Type 1", new Hdd("WC3", 128), new Ram("Test 3", 512), 100));
        computers.add(new Laptop("Acer", "XYZ", new Hdd("WC4", 1024), new Ram("Test 4", 1024), 68));
        computers.add(new PC("Stacjonarny 1", "AiO", new Hdd("Brand1", 1024), new Ram("rm1", 256)));
        computers.add(new PC("Stacjonarny 2", "i7", new Hdd("Brand2", 512), new Ram("rm2", 512)));
        computers.add(new PC("Stacjonarny 3", "Ryzen 5", new Hdd("Brand3", 5000), new Ram("rm1", 128)));

//--------1
        long count = computers.stream()
                .map(Computer::getRam)
                .filter(comp -> comp.getSize() >= 128)
                .count();
        System.out.println("Liczba komputerów z RAM >= 128: " + count);

//--------2
        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

//--------3
        Optional<Ram> max = computers.stream()
              .map(Computer::getRam)
              .max(Comparator.comparingInt(Ram::getSize));
        if(max.isPresent()){
            System.out.println("Max ram to: "+max.get().getSize());
        }else {
            System.out.println("Nie znalazłam takiego elementu");
        }

//--------4
        List<Computer> newList = computers.stream()
                .filter(c -> c.getHdd().getSize() <= 500)
                .collect(Collectors.toList());

        for (Computer c: newList
             ) {
            System.out.println("Z nowej kolekcji "+c.getName() +" "+ c.getHdd());
        }

//---------5
        computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .forEach(sorted -> System.out.println("Posortowane: "+sorted.getName()+" "+sorted.getType()));

    }
}
