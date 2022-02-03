package Interface;

public class LEDTV implements TV{

    @Override
    public void turnOn() {
        System.out.println("On");
    }

    @Override
    public void turnOff() {
        System.out.println("Off");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("volume changed");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("channel changed");
    }
}
