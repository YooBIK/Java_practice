package Class;

public class MethodOverLoad {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public String add(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverLoad m1 = new MethodOverLoad();
        System.out.println(m1.add(3,5));
        System.out.println(m1.add(1,2,3));
        System.out.println(m1.add("hi ","hello"));
    }
}
