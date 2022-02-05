package Module12_Exceptions.enums;

public enum Gender {

    KOBIETA("Kobieta"),
    MEZCZYZNA("Mężczyzna");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
