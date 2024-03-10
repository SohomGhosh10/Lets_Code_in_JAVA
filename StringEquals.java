public class StringEquals {
    public static void main(String[] args) {
        String s = "Hello";
        String t = "Hello";
        String r = "hello";

        System.out.println(s.equals(t));
        System.out.println(s.equals(r));

        System.out.println(s == t);
        System.out.println(s == r);

        System.out.println(s.equalsIgnoreCase(t));
        System.out.println(s.equalsIgnoreCase(r));
    }
}
