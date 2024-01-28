import java.util.*;

public class Array_Check_Sorted {
    public static void main(String[] args) {
        int arr[] = {1 , 255 , 1300 , 3 , 54 , 40000 , 32 , 10 , 100};
        boolean isSorted = true;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
