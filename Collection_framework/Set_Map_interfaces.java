import java.util.*;

public class Set_Map_interfaces {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Shlok");
        set.add("Aditya");
        set.add("Rohit");
        set.add("Mohit");
        //--------- contains(Object o)->return boolean 
        System.out.println(set.contains("Rohit"));

        Map<Integer, String> map  = new HashMap<>();
        map.put(101, "Shlok");
        map.put(102, "Rohit");
        map.put(103,"Mohit");
        map.put(104,"Aditya");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(103));
        
        
    }
}
