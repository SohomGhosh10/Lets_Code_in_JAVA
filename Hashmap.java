import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        // syntax: hashMap<key , value> variable_name = new hashMap<>(); 
        HashMap<String , Integer> hm = new HashMap<>();

        // Value insertion
        hm.put("Sohom" , 64);
        hm.put("Somnath" , 65);
        hm.put("Soumodip" , 66);
        
        System.out.println(hm);
        // Value updation 
        hm.put("Sohom" , 70);
        System.out.println(hm);

        if(hm.containsKey("Somnath")){
            System.out.println("Present");
        }
        // Value of the key
        System.out.println(hm.get("Sohom"));

        //Iterate through hashmap
        for(Map.Entry<String , Integer> e : hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
