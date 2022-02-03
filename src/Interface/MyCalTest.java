package Interface;

public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.sum(1,2);
        int i = cal.exec(3,4);
        System.out.println(cal.sum(1,2));
        System.out.println(i);
        System.out.println(Calculator.exec2(6,6));
    }

}
