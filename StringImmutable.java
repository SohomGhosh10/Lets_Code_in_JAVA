public class StringImmutable {
    public static void main(String[] args) {
        String p = new String("Hello");
        p = "Hello" + "Hi";
        System.out.println(p);

        String NewString = "Hello";
        NewString = NewString.concat("World");
        System.out.println(NewString);
    }
}
