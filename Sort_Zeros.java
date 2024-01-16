import java.util.*;

public class Sort_Zeros {
    public static void main(String[] args) {
        int arr[] = {3 , 0 , 5 , 0 , 2};
        int n = arr.length;
        SortZeros(arr , n);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    static void SortZeros(int arr[] , int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] == 0 && arr[j + 1] != 0){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
