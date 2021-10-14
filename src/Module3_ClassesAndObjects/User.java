package Module3_ClassesAndObjects;

public class User {
    //1. Pola obiektu, które opisują z czego bedzie sie skladal dany obiekt

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    //3. Konstruktor - domyślny tworzy pusty obiekt
    //Nazwa konstruktora jest taka sama jak nazwa klasy
    //Nazwę piszemy z wielkiej litery
    //konstruktor nie ma zwracanego typu
    User() {

    }

//    User(String firstNameParam, String lastNameParam, String emailParam, int ageParam, boolean isAdultParam) { //mozna dać inne nazwy, ale nie stosuje się tego
//        firstName =firstNameParam;  //do pola obiektu przypisujemy pole z konstruktora
//        lastName = lastNameParam;
//        email = emailParam;
//        age = ageParam;
//        isAdult = isAdultParam;
//    }


    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;  //do pola obiektu przypisujemy pole z konstruktora
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }
    //2. metody opisują to co dany obiekt bedzie mógl zrobic

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + "! Nice to see you");
    }

    //przeciązenie metody - może mieć tą samą nazwę ale liczba lub typ parametrów muszą się różnić
    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + "! Nice to see you");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

}
