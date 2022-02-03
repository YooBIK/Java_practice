package Interface;

public class InterfaceExam {
    public static void main(String[] args) {
        TV tv = new LEDTV();
        tv.turnOn();
        tv.turnOff();
        tv.changeChannel(20);
        tv.changeVolume(40);
    }
}
