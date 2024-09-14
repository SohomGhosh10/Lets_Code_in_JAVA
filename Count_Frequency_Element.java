import java.util.*;
public class Count_Frequency_Element {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        HashSet<Integer> hs = new HashSet<>(arr);
        for(int i : hs){
            System.out.println(i + "-" + Collections.frequency(arr, i));
        }    
    }
}
