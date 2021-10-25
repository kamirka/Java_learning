package Module7_Inheritance.computer;

public class PC extends Computer {

    private boolean power;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        power=false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checing power supply");
        if (power) {
            super.switchOn(); // wywołujemy metote z klasy matki "hej mamo jestes super ;)"
        } else {
            System.out.println("Turn power ON!");
        }
    }

    public void setPower(boolean newPower) {
       power = newPower;
    }
}