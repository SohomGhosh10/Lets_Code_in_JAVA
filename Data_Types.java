public class Data_Types {
    public static void main(String[] args){
        byte x = 10;
        int y = 6;
        short z = 12;
        int a = y + z; // int + short = int
        float b = 6.54f + x; // float + int = float

        System.out.println(a); // int
        System.out.println(b); // float

        // Increment and Decrement operators
        int i = 56;
        System.out.println(i++); // 56
        System.out.println(i); // 57
        System.out.println(++i); // 58
        System.out.println(i); // 58

        int c;
        int d = 7;
        c = ++d * 8; // 8 * 8
        System.out.println(c); // 64
    }
}
