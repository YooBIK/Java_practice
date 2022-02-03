package Interface;

public interface Calculator {
    public int sum(int a, int b);
    public int mul(int a, int b);
    default public int exec(int a,int b){
        return a+b;
    }

    //인터페이스명.static메소드명 으로 호출, 인스턴스의 함수로 호출 불가능
    public static int exec2(int a, int b){
        return a*b;
    }
}
