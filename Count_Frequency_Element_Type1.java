import java.util.*;
public class Count_Frequency_Element_Type1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n]; 

        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        HashSet<Integer> hs = new HashSet<>();
        for(int element : arr1){
            hs.add(element);
        } 

        for(int element:hs){
            int count = 0;
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] == element){
                    count++;
                }
            }
            System.out.println(element + " - " + count);
        }
    }
}
