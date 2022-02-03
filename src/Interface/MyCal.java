package Interface;

public class MyCal implements Calculator{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int exec(int a, int b) {
        return Calculator.super.exec(a, b);
    }
}
