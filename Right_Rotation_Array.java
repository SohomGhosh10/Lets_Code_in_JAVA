public class Right_Rotation_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotate(arr1, 2);
        printArray(arr1); // Output: [3, 4, 5, 1, 2]

        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotate(arr2, 3);
        printArray(arr2); // Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]

        int[] arr3 = {7, 3, 9, 1};
        rotate(arr3, 9);
        printArray(arr3); // Output: [3, 9, 1, 7]
    }

    public static void rotate(int[] arr , int d){
        int n = arr.length;
        // Handle cases where d > n
        d = d % n;

        // Step 1: Reverse the last d elements
        reverse(arr, n - d , n - 1);

        // Step 2: Reverse the first elements
        reverse(arr, 0, n - d - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

