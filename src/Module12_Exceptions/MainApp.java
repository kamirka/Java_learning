package Module12_Exceptions;

import Module12_Exceptions.enums.WeekDays;
import jdk.swing.interop.SwingInterOpUtils;

public class MainApp {
    public static void main(String[] args) {

        System.out.println(WeekDays.PONIEDZIALEK);

        if("Poniedziałek".equals(WeekDays.PONIEDZIALEK)){
            System.out.println("Jest ok");
        } else {
            System.out.println("Nie jest ok");
        }

    }
}
