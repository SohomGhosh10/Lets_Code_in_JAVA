public class String_subsequence {
    public static void main(String[] args) {
        String s1 = "Classroom";
        System.out.println(s1.subSequence(0 , 5));


        String s2 = (String)s1.subSequence(0, 5);
        System.out.println(s2);

        System.out.println(s1.subSequence(5 , 9));

        String s7 = (String)"Hello".subSequence(0,2);
        System.out.println(s7.repeat("Hello".length()));
        String s8 = (String)"Hello".subSequence("Hello".length()-2, "Hello".length());
        System.out.println(s8.repeat("Hello".length()));
    }
}
