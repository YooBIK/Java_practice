package Class;

public class MyClass {
    //public 반환타입 메소드명(매개변수){ 구현 }
    public void method1(){
        System.out.println("method1");
    }
    public void method2(int x){
        System.out.println("method2, x = " + x);
    }

    public int method3(){
        System.out.println("method3, 10을 return");
        return 10;
    }

    public void method4(int a, int b){
        System.out.println("method4, a + b = " + (a+b));
    }

    public int method5(int a){
        System.out.println("method5, 2*a return");
        return a*2;
    }
}
