package Module9_Interface.Composition;


import Module9_Interface.Music;
import Module9_Interface.Video;

public class Laptop extends Computer implements Music, Video { //diamond of dependency diament zależności można dziedziczy tylko po jednej klasie
    //MATKA JEST TYLKO JEDNA

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram); //super zawsze musi być pierwszą linijką
        this.batteryLevel = batteryLevel;

    }

    public int volumeUP() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDOWN() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeUP(int volume) {
        volumeLevel = volume + volumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }


    @Override
    public int volumeDOWN(int volume) {
        volumeLevel = volumeLevel - volume;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
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

    @Override
    public void switchOff() {

        System.out.println("Wyłączam Laptop: " + name);

    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause music");

    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");

    }

    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("Play video");

    }

    @Override
    public void pauseVideo() {
        System.out.println("Pause Video");

    }

    @Override
    public void stopVideo() {
        System.out.println("Stop Video");

    }
}
