package Class;

public class StringExam {
    public static void main(String[] args) {
        //String은 new를 사용하지 않고 인스턴스를 만들 수 있다.
        String str1 = "hello";
        //"hello"라는 문자열이 메모리 중에서 상수가 저장되는 영역에 저장된다. 상수는 변하지 않는 값을 의미.
        String str2 = "hello";
        // 이 문장이 실행될 때에 hello 라는 문자열 상수는 이미 만들어져 있으므로
        //str1이 참조하는 인스턴스를 str2도 참조한다.

        //new연산자를 이용하여 인스턴스를 만들면 인스턴스는 무조건 새롭게 만들어진다.
        //String str4 = new String("hello"); 이 문장이 실행될때도 새롭게 만들게 되므로,
        //str3 과 str4는 서로 다른 인스턴스를 참조한다.
        String str3 = "hello";
        String str4 = new String("hello");

        if(str1==str2){
            System.out.println("str1==str2");
        }

        if(str1!=str3){
            System.out.println("str1!=str3");
        }

        if(str3!=str4){
            System.out.println("str3!=str4");
        }

        if( str1.equals(str2) ){
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }
    }
}
