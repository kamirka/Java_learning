package Module7_Inheritance.computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram); //super zawsze musi być pierwszą linijką
        this.batteryLevel = batteryLevel;

    }

    @Override
    public void switchOn() {

        System.out.println("Checking battery level");
        if (batteryLevel > 20) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel=newBatteryLevel;
    }
}
