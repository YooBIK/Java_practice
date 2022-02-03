package Class;


//static 키워드가 붙으면 객체가 인스턴스화(선언?) 되지 않아도 static이 붙은 메서드나 변수를 사용할 수 있다.
public class VariableScope {
    int globalScope = 10;
    static int staticVal = 7;


    public void scopeTest1(int val1) {
        int localScope = 20;
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(val1);
    }

    public void scopeTest2(int val2){
        System.out.println(globalScope);
    }

    public static void main(String[] args) {
        //System.out.println(globalScope);  //컴파일 오류
        System.out.println(staticVal);      //가능
   }
}
