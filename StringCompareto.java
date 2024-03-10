public class StringCompareto {
    public static void main(String[] args) {
        String a = new String("Hello Java Coders");
        String b = new String("Hello Java Coders");
        String c = new String("Hello Java Boders");

        /*
            if a == b:
            then return 0
            else if a > b:
            return 1
            else:
            return -1
         */

        System.out.println("a==c : " + a.compareTo(c));

        /*
            a = "Hello Java Coders" and c = "Hello Java Boders";
            it is mismatched in B and C
            ASCII(C) - ASCII(B) = 1
         */

        System.out.println("c==a : " + c.compareTo(a));

        /*
         a = "Hello Java Coders" and c = "Hello Java Boders";
            it is mismatched in B and C
            ASCII(B) - ASCII(C) = -1
         */

        String x = new String("Hello Java Coders");
        String y = new String("Hello Java Coders");

        System.out.println("x==y : " + x.compareToIgnoreCase(y));
    }
}
