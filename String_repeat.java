public class String_repeat {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        int n = s1.length();
        String s2 = s1.repeat(n);

        System.out.println(s2);
    }
}
