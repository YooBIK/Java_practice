public class Array2 {
    public static void main(String[] args) {
        int[] iArray = new int[100];
        for(int i=0; i<iArray.length;i++){
            iArray[i]=i+1;
        }
        int sum = 0 ;
        for(int i=0;i<iArray.length;i++){
            sum = sum + iArray[i];
        }
        System.out.println("sum = " + sum);
    }
}
