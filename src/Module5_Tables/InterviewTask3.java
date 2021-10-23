package Module5_Tables;

public class InterviewTask3 {
    public static void main(String[] args) {
        int numbers[] = {2, 4, 1, 9, 5, 2, 4, 8, 5,9,0};
        int min;
        for (int i = 0; i <= numbers.length-1; i++) {
            min = numbers[i];
            for (int j = i + 1; j <= numbers.length-1; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }

            }
            for (int number :
                    numbers) {
                System.out.println(number);
            }

        }
    }
}
