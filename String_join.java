public class String_join {
    public static void main(String[] args) {
        String s1 = new String("Sun , Mon , Tue , Wed , Thu , Fri , Sat");
        System.out.println(s1);
        String arr[] = s1.split(", ");
        /*
         * After split
         * it will return Array of Strings
         */

        for(String x : arr){
            System.out.println(x);
        }

        String n = String.join("-",arr);
        /*
         * 1st parameter: "joining Character"
         * 2nd parameter: "Array of strings"
         */
        System.out.println(n);
    }
}
