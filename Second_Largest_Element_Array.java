import java.util.*;
public class Second_Largest_Element_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int larger = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                larger = max;
                max = arr[i];
            }
            else if(arr[i] > larger && arr[i] != max){
                larger = arr[i];
            }
        }
        System.out.println(larger);
    }
}
