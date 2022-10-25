import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){


        int[] numbers = {1,2,43,5,43,54,6,5,7,6,78,67,879,8,9};
        int[][] marray2 = new int[3][5];
        System.out.println(marray2[2]);
        System.out.println(Arrays.deepToString(marray2));
        int[] newNumbers = new int[5];
        System.out.println(numbers.length);
        System.arraycopy(numbers,10,newNumbers,0,5);
//        System.arraycopy(numbers,0,marray2[0],0,5);
//        System.arraycopy(numbers, 9,marray2[2],0,5);
        System.arraycopy(numbers,5,marray2[1],0,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(marray2));

        //1 src
        //2 src pos
        //3 dest
        //4 dest pos
        //5 length




//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(newNumbers));






}
    
}