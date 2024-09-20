import java.util.*;
public class Replace_Elements_By_Rank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            Set <Integer> s = new HashSet <Integer>();
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    s.add(arr[j]);
                }
            }
            int rank = s.size() + 1;
            System.out.print(rank + " ");
        }
    }
}
