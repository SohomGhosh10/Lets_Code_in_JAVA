public class String_Remove {
    public static void main(String[] args) {
        String s1 = new String("Today is Saturday");
        s1 = s1.replace("is" , ",");
        System.out.println(s1);
        /*
         * String.replace("What string to replace" , "By which String");
         */
        s1 = new String("Today is Saturday Saturday");
        s1 = s1.replace("is",",").replace("Saturday","Sunday");
        /*
         * s1.replace("is",", ").replace("Saturday","Sunday")
         * = "Today , Saturday".replace("Saturday", "Sunday")
         * = Today , Sunday 
         */

        System.out.println(s1);
    }
}
