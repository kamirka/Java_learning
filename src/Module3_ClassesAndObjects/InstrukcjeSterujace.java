package Module3_ClassesAndObjects;

public class InstrukcjeSterujace {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        if (num1 > num2) {
            System.out.println("Num1 is bigger then num2");
        } else {
            System.out.println("Num1 is less than num2");
        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "cos";

        switch (page) {
            case "Home":
                System.out.println("home");
                break;
            case "Login":
                System.out.println("login");
                break;
            case "Contact":
                System.out.println("contact");
            default:
                System.out.println("Nie znam takiej strony");

        }


    }
}
