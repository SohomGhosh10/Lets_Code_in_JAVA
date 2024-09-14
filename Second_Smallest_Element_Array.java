import java.util.*;
public class Second_Smallest_Element_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                smallest = min;
                min = arr[i];
            }
            else if(arr[i] < smallest && arr[i] != min){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
