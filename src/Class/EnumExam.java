package Class;

public class EnumExam {
    static Color c = Color.BLUE;

    public static void main(String[] args) {
        System.out.println(c);
    }

}

enum Color{
    RED(0),BLUE(1),GREEN(2),YELLOW(3);

    private final int num;
    Color(int x){
        this.num = x;
    }
}
