import java.util.*;
public class Sort_Array_Ascending_Order {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing in ascending order");
        sort1(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("Printing in descending order");
        sort2(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void sort1(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                int temp;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort2(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                int temp;
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
