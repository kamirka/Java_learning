package Module9_Interface.Composition;


abstract public class Computer {
    //klasa matka :)
    //DRY - Dont reapet yourself
    //dobra praktyka aby pola w klasie matki były protected - wtedy klasy dziedziczące tez będą miały dostęp
    protected String name;
    protected String type;
    protected Hdd hdd; //składa się z obiektu
    protected Ram ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public abstract int volumeUP(); //ta metoda nie ma ciała i musi mieć metody z tą samą nazwą we wszystkich klasach ktore dziedzicza po matce

    public abstract int volumeDOWN();


    public abstract int volumeUP(int volume);

    public abstract int volumeDOWN(int volume);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("super-matka");
        state = true;
    }

    public void switchOff() {
        System.out.println("Wyłączam komupter: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }
}

