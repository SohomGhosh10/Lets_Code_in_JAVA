import java.util.*;
public class Subset_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr1[]={1,3,4,5,2};
	    int arr2[]={2,4,3,1,7,5,15};

        int m = arr1.length;
        int n = arr2.length;

        boolean ans = isSubset(arr1, arr2, m, n);
        if(ans == true){
            System.out.println("Two arrays are subset");
        }else{
            System.out.println("They are not subset");
        }
    }
    public static boolean isSubset(int[] arr1 , int[] arr2 , int m , int n){
        if(m > n){
            return false;
        }
        for(int i = 0; i < m; i++){
            boolean present = false;
            for(int j = 0; j < n; j++){
                if(arr1[i] == arr2[j]){
                    present = true;
                    break;
                }
            }
            if(present == false){
                return false;
            }
        }
        return true;
    }
}
