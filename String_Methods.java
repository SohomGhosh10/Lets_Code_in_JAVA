import java.util.*;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Sohom";
        System.out.println(name);

        int value = name.length();
        System.out.println(value); // 5

        String lstr = name.toLowerCase();
        System.out.println(lstr); // sohom

        String ustr = name.toUpperCase();
        System.out.println(ustr); // SOHOM

        String nonTrimmed = "       Harry      ";
        String trimmed = nonTrimmed.trim();
        System.out.println(trimmed); // Harry

        System.out.println(name.substring(1)); // ohom
        System.out.println(name.substring(1 , 4)); // oho
        System.out.println(name.replace('o' , 'a')); // Saham
        System.out.println(name.replace("o" , "ier")); // Sierhierm
        System.out.println(name.startsWith("Soh")); // True
        System.out.println(name.endsWith("om")); // True
    }
}
