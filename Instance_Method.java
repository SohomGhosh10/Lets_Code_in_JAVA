import java.util.*;

class Geek{
    String name = " ";

    public void geek(String name){
        this.name = name;
    }
}

public class Instance_Method {
    public static void main(String[] args) {
        Geek obj = new Geek();
        obj.geek("SohomGhosh");
        System.out.println(obj.name);
    }
}
