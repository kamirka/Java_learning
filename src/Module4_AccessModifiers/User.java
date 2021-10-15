package Module4_AccessModifiers;

public class User {
    //1. Pola obiektu, które opisują z czego bedzie sie skladal dany obiekt
    //dobra praktyką jest ustawianie pól jako prywatnych

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    //3. Konstruktor - domyślny tworzy pusty obiekt


    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;  //do pola obiektu przypisujemy pole z konstruktora
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
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

}
