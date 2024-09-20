import java.util.*;
public class Sum_Of_Elements_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        double avg = 1.0;

        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            avg = (double)sum / arr.length;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
