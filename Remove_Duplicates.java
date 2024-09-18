import java.util.*;
public class Remove_Duplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = remove(arr);
        for(int i = 0 ; i < k ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int remove(int[] arr){
        Arrays.sort(arr);
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
