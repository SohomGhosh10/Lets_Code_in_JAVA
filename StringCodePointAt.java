public class StringCodePointAt {
    public static void main(String[] args) {
        String a = new String("ABCDEFGH");

        /*
            Convert a character of a string directly into ASCII
         */

        for(int i = 0; i < a.length(); i++){
            System.out.println(a.codePointAt(i));
        }
        System.out.println("\n" + a.codePointAt(2));
    }
}
