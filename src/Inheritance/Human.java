package Inheritance;



public class Human extends Animal{
    @Override
    public void walking(){
        System.out.println("walking");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.walking();

    }
}
