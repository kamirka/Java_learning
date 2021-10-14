package Module2_DataTypes;

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        double a = 10;
        double b = 4;

        int num1 = 1;
        int num2 = 2;
//operatory matetmatyczne
        System.out.println(10+10);
        System.out.println(10-10);
        System.out.println(10*10);
        System.out.println(a/b);

        //operatpry porównania
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b); //porównanie
        System.out.println(a!=b); //sprawdzenie czy są różne

        //operatory logiczne
        System.out.println(a>b || a==b);
        System.out.println(a>b && a==b);
    }
}
