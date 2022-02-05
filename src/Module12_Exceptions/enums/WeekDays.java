package Module12_Exceptions.enums;

public enum WeekDays {
    //przechowujemy tylko stałe, są to typy wyliczeniowe
    PONIEDZIALEK("Poniedziałek"),
    WTOREK("Wtorek"),
    SRODA("Środa"),
    CZWARTEK("Czwartek"),
    PIATEK("Piątek"),
    SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
