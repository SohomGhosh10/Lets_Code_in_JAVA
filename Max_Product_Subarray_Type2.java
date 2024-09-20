public class Max_Product_Subarray_Type2 {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        int result = arr[0];
        for(int i = 0; i < arr.length; i++){
            int p = arr[i];
            for(int j = i+1; j < arr.length; j++){
                result = Math.max(result , p);
                p *= arr[j];
            }
            result = Math.max(result , p);
        }
        System.out.println(result);
    }
}
