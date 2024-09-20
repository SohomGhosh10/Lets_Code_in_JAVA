import java.util.*;
public class Rotate_Array_By_K {
    public static void rotatearray(int[] arr){
        int n = arr.length;
        int last = arr[n-1];

        for(int i = n - 1; i >= 1; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void rotate(int[] arr , int k){
        int n = arr.length;
        for(int i = 0; i < k; i++){
            rotatearray(arr);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, k);
        System.out.println("Array after rotation by " + k + " elements: " + Arrays.toString(arr));
    }
}
