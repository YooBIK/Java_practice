public class Array3 {
    public static void main(String[] args) {
        int[][] array1 = new int[3][4];
        array1[0][1] = 10;
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(array1[0][1]);
        System.out.println(array2[0][0]);
    }
}
