import java.util.*;

public class Array_Reverse {
    public static void main(String args[]){

        int arr[] = {1 , 2 , 3 , 4 , 5};
        int n = arr.length;
        int mid = Math.floorDiv(n , 2); // calculating mid index

        for(int i = 0; i < mid; i++){
            // swapping elements arr[i] and arr[n-i-1]
            int temp;
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println("The reversed array is\n");
        for(int elements:arr){
            System.out.print(elements + " ");
        }
    }
}
