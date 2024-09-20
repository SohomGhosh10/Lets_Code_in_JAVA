public class Max_Product_Subarray_Type1 {
    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
        int result = Integer.MIN_VALUE;
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                for(int k = i; k <= j; k++){
                    product *= nums[k];
                }
                result = Math.max(product , result);
            }
        }
        System.out.println(result);
    }
}
