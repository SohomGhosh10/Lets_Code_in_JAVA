public class String_toChars {
    public static void main(String[] args) {
        String str = new String("Classroom");
        char arr[] = str.toCharArray();
        System.out.println(arr);

        for(char element : arr){
            System.out.println(element);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Index " + i);
            System.out.println("Element " + arr[i]);
        }

        String newstr = new String(arr);
        System.out.println(newstr);
    }
}
