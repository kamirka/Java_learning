package Module5_Tables.HomeWork4;

public class Homeork4 {
    public static void main(String[] args) {
        int numbers[]={0,2,6,2,7,9,2,7,9};
        int max;

        for(int i=0;i<=numbers.length -1; i++){
            for(int j=i+1; j<=numbers.length-1;j++){
            max=numbers[i];
            if(max<numbers[j]){
                max=numbers[j];
                numbers[j]=numbers[i];
                numbers[i]=max;
            }
            }
        }
        for (int number:
             numbers) {
            System.out.println(number);
        }
    }
}
