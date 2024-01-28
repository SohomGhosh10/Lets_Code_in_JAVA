public class Method_Overloading_Case1 {
    static void change(int a){ // value of x is passed as a copy only
        a = 45; // value will not change while running
    }

    public static void main(String[] args) {
    int marks[] = {52 , 87 , 78 , 99 , 68 , 77};
    // Case 1: Changing the integer
    int x = 94;
    System.out.println("Value of x is: " + x);
    change(x); // Value is passed only as a copy
    }
}
