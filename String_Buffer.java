public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        System.out.println(s);

        System.out.println("The capacity is: " + s.capacity());

        StringBuffer sb = new StringBuffer("Thursday comes after");
        System.out.println("The String is: " + sb);
        System.out.println("The capacity is: " + sb.capacity());

        System.out.println("The length of sb is : " + sb.length());

        StringBuffer b = new StringBuffer("Hello");
        System.out.println("The character at index 2 is: " + b.charAt(0));

        StringBuffer r = new StringBuffer("Hello");
        System.out.println("The StringBuffer r is (before modification): " + r);
        r.setCharAt(4 , 'z');
        System.out.println("After modification " + r);

        StringBuffer t = new StringBuffer("Hello");
        System.out.println("Before modification: (Length) " + t.length());
        t.setLength(20);

        System.out.println("The content in t is : " + t);

        /*
         * getChars()
         * Characters are copied from this sequence into destination
         * First character to be copied is at index srcBegin;
         * The last caharcter to be copied is at index srcEnd-1
         * The total number of characters to be copied is srcEnd-srcBegin
         * Ending index :-
         *  dstBegin + (srcEnd-srcBegin) - 1 
         * 
         */
        StringBuffer x = new StringBuffer("0.1234567890123456");
        char w[] = new char[100];
        x.getChars(5, 10, w, 0);

        System.out.println();
        System.out.println();
        System.out.println("The length of w : " + w.length);

        String a;
        int c = 42;
        StringBuffer q = new StringBuffer(40);
        a = q.append("c=").append(c).append("!").toString();
        System.out.println(a);
    }
}
