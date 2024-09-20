import java.util.*;
public class Reverse_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
