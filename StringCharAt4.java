public class StringCharAt4 {
    public static void main(String[] args) {
        String s = new String("Classroom");
        System.out.println(s.length()); //  but for string it is stringname.length()
        System.out.println(args.length); // For array only arrayname.length is allowed
        //System.out.println(s.charAt(0));
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        /*
            CharAt(position):
            Method
            Returns the character in that particular position of the string

            In case of array we can pick arrayname[index]
            In case of string, we need to use
            StringObject.charAt(index)

         */

        System.out.println(s.charAt(s.length()-1));
        /*
            s.charAt(s.length()-1) is for obtaining last element.
            s.length() is 9 in this case
            so it is obtaining last element
         */
    }
}
