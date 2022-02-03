package Inheritance;

public class Bus extends Car {
    public void run(){
        super.run();
        System.out.println("Bus's run");
    }
    public void sound(){
        System.out.println("rrr");
    }
}
