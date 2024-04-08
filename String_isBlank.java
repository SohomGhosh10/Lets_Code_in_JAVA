public class String_isBlank{
    public static void main(String[] args) {
        String s1 = new String("     ");
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());

        String s2 = new String("");
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());

        String s3 = new String("HelloWorld");
        System.out.println(s3.isBlank());
        System.out.println(s3.isEmpty());


        /*
         * Returns true if the string is empty or contains only white space code points, otherwise false
         */

         /*
          * isEmpty():
          if String.length() == 0: isEmpty() returns true

          isBlank():
          if String.trim().length() == 0 : isBlank() returns true
          if String.trim().length() != 0 : isBlank() returns false
          */
    }
}