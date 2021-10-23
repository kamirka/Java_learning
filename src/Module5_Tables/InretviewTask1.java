package Module5_Tables;

public class InretviewTask1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        //dwie zmienne
//        int first = numbers[0];
//        int last = numbers[numbers.length-1];
//
//        numbers[0]=last;
//        numbers[numbers.length-1]=first;


        //jedna zmienna
//        int first = numbers[0];
//        numbers[0] = numbers[numbers.length-1];
//        numbers[numbers.length-1]=first;
//

//bez zmiennych
        numbers[numbers.length - 1] = numbers[0] + numbers[numbers.length - 1];

        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println("------------");

        numbers[0] = numbers[numbers.length - 1] - numbers[0];
        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println("------------");

        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
