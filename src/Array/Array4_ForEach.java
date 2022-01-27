public class Array4_ForEach {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        //기존 사용 방법
        for(int i =0; i<array.length;i++){
            int num = array[i];
            System.out.println(num);
        }

        //for each 사용
        for(int num:array){
            System.out.println(num);
        }
    }
}
