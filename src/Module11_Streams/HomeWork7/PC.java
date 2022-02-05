package Module11_Streams.HomeWork7;

    public class PC extends Computer {

        private boolean power;

        public PC(String name, String type, Hdd hdd, Ram ram) {
            super(name, type, hdd, ram);
            power = false;
        }

        public void showComputerName() {
            System.out.println(name);
        }

        public int volumeUP() {
            return volumeLevel += 1;
        }

        @Override
        public int volumeDOWN() {
            volumeLevel -= 1;
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
            System.out.println("Checing power supply");
            if (power) {
                super.switchOn();
            } else {
                System.out.println("Turn power ON!");
            }
        }

        @Override
        public void switchOff() {

            System.out.println("Wyłączam PC: " + name);

        }

        public void setPower(boolean newPower) {
            power = newPower;
        }
    }
