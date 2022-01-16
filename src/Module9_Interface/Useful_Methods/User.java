package Module9_Interface.Useful_Methods;


import java.util.Objects;

public class User {

    private static int userCounter = 0;
    //1. Pola obiektu, które opisują z czego bedzie sie skladal dany obiekt
    //dobra praktyką jest ustawianie pól jako prywatnych

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    //3. Konstruktor - domyślny tworzy pusty obiekt


   public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;  //do pola obiektu przypisujemy pole z konstruktora
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.endsWith("ru")){
            System.out.println("RU emails are not allowed");
        }else{
            this.email=email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }


//2. metody opisują to co dany obiekt bedzie mógl zrobic

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName+" "+email + " " + age + " " + isAdult);
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

    public static int getUserCounter(){
        return userCounter;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }
}
