package Module12_Exceptions.HomeWork8;

import Module12_Exceptions.User;
import Module12_Exceptions.enums.Gender;
import Module12_Exceptions.exceptions.IllegalEmailFormatException;

import java.util.Objects;

public class UserHomeWork implements Comparable<UserHomeWork>{

        private static int userCounter = 0;

        private String firstName;
        private String lastName;
        private String email;
        private int age;
        private boolean isAdult;
        protected Gender gender;

        //3. Konstruktor - domyślny tworzy pusty obiekt


        public UserHomeWork(String firstName, String lastName, String email, int age, Gender gender) {
            this.firstName = firstName;  //do pola obiektu przypisujemy pole z konstruktora
            this.lastName = lastName;
            this.email = email;
            this.age = age;
            this.gender = gender;
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

        public void setEmail(String email) throws IllegalEmailFormatException { //dobrą praktyką jest tu "throws" jako informacja dla osob ktore będą korzystac z tej metody
            if(!email.contains("@")){
                //  throw new IllegalArgumentException("Incorrect e-mail format"); jeśli nie korzystamy ze swoich wyjątków
                throw new IllegalEmailFormatException("Incorrect e-mail format-MK"); //nowo utworzony wyjątek - własny
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
            UserHomeWork user = (UserHomeWork) o;
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

        @Override
        public int compareTo(UserHomeWork user) {
            int compareResult = this.getFirstName().compareTo(user.getFirstName());
            if(compareResult==0){
                compareResult =this.getLastName().compareTo(user.getLastName());
            }
            return compareResult;
            //-1 jeśli obiekt pierwszy jest mniejszy niż drugi obiekt
            //0 jeśli obiekty są takie same
            //1 jeśli obiekt drugi jest mniejszy niż pierwszy
        }
    }
