package Module5_Tables;

import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {
        String[] names = new String[5];

        int[] numbers = {1,2,3,4,5}; //drugi sposób tworzenia tablicy

        names[0] = "Mira";
        names[1] = "Ola";
        names[2] = "Ala";
        names[3] = "Kasia";
        names[4] = "Basia";

        for(int i=0; i<names.length;i++){   // w tej pętli ważny jest indeks i można przejśc np co drugi element
            System.out.println(names[i].toLowerCase());
        }

        
        //fore => forEach w tej pętli przechodzi przez każdy element!
        for (String name: names) {
            System.out.println(name.toUpperCase());
        }

        int number =10;
//        number = number+1; // to jest ten sam zapis
//        number+=1;

//        System.out.println(number++); //post increment
//        System.out.println(number);

        System.out.println(++number); //pre increment
        System.out.println(number);
    }
}
