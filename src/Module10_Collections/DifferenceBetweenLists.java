package Module10_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DifferenceBetweenLists {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>(); //lista dwustronnie połączona

        names1.add("Mira");
        names2.add("Paula");

        names1.get(0);
        names2.get(0);

        names1.remove(0);
        names2.remove(0);

        //obie listy są do siebie bardzo podobnie
        //w array list wiemy na ktorym indeksie jest trzymany element -> jest lepsza jeśli chcemy dodawać coś do środka listy ->jest szybsza

        //ArrayList<String
        //[Element1, Element2, Element3]
        //[0 1 2]

        //LinkedList
        //[Element1 <-> Element2 <-> Element3]
    }
}
