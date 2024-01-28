import java.util.*;

public class Array_Max_Min {
    public static void main(String[] args) {
        int arr[] = {1 , 21 , 455 , 34 , 55 , 99};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("The max element of this array is\n");
        for(int element:arr){
            if(element > max){
                max = element;
            }
        }
        System.out.println(max);

        System.out.println("The min element of this array is\n");
        for(int element:arr){
            if(element < min){
                min = element;
            }
        }
        System.out.println(min);
    }
}
