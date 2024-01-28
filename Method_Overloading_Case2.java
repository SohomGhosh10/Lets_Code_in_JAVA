public class Method_Overloading_Case2 {
    static void change(int a[]){
        a[0] = 98;
    }

    public static void main(String[] args) {
        int marks[] = {52 , 87 , 78 , 99 , 68 , 77};
        // Changing the content of the array
        change(marks);
        System.out.println("Value of 1st marks is:" + marks[0]); // marks[0] will be updated to 98
    }
}
