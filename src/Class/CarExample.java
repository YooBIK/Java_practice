package Class;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "A";
        c1.number = 1;
        c2.name = "B";
        c2.number = 2;

        System.out.println("c1.name = " + c1.name);
        System.out.println("c1.number = " + c1.number);
        System.out.println("c2.name = " + c2.name);
        System.out.println("c2.number = " + c2.number);

    }
}
