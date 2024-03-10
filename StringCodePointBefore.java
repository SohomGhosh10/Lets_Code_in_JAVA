public class StringCodePointBefore {
    public static void main(String[] args) {
        String a = new String("ABCDEFGH");
        System.out.println(a.codePointBefore(2)); // Finds out ASCII for the character before the index

        System.out.printf("%c",a.charAt(2));
    }
}
