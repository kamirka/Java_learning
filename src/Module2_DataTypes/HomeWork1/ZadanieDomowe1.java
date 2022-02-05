package Module2_DataTypes.HomeWork1;

public class ZadanieDomowe1 {
    public static void main(String[] args) {

        int numOne = 14;
        int numTwo = 2;
        int numThree = 7;
        int numFour = 1;

        int sumOne = numOne + numTwo;
        int sumTwo = numThree + numFour;

        if ((sumOne % 2) == 0) {
            System.out.println("Pierwsza Suma jest parzysta");
        } else {
            System.out.println("Pierwsza Suma jest nieparzysta");
        }

        if ((sumTwo % 2) == 0) {
            System.out.println("Druga Suma jest parzysta");
        } else {
            System.out.println("Druga Suma jest nieparzysta");
        }

        if ((((sumOne % 2) == 0)) && ((sumTwo % 2) == 0)){
            System.out.println("Dwie sumy są parzyste");
        }else {
            System.out.println("Dwie sumy nie są parzyste");
        }
    }
}
