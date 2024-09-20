import java.util.*;
public class Find_Median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(n % 2 == 0){
            int ind1 = (n / 2) - 1;
            int ind2 = n / 2;
            System.out.println((double)(arr[ind1] + arr[ind2]) / 2);
        }else{
            System.out.println(arr[n / 2]);
        }
    }
}
