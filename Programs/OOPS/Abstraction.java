package Programs.OOPS;

abstract class ElectronicDevice {

    abstract void powerOn();
}

interface Camera {
    void takePhoto();
}

interface GPS {
    void getCordinates();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone extends ElectronicDevice implements Camera, GPS, MusicPlayer {

    @Override
    void powerOn() {
        System.out.println("smartphone is power on");
    }

    @Override
    public void playMusic() {
        System.out.println("music is playing");
    }

    @Override
    public void getCordinates() {
        System.out.println("coordinates are this & this");
    }

    @Override
    public void takePhoto() {
        System.out.println("this is the photo");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        GPS s1 = new SmartPhone();
        s1.getCordinates();
    }
}