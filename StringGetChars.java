public class StringGetChars {
    public static void main(String[] args) {
        String s = "Classroom";
        int start = 5;
        int end = 9;
        char temp[] = new char[end-start];

        s.getChars(start , end , temp , 0);
        /*
            We are storing the substring
            within another character array

            srcBegin: index of the first character in the string to copy
            srcEnd : index of the last character in the string to copy
            dst : the destination array
            dstBegin : the start offset in the destination array
         */

        System.out.println(temp);
        System.out.println(temp.length);
    }
}
