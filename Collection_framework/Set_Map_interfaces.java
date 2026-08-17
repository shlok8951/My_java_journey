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
        
        //------------------------- Constructors of HashSet and LinkedHashSet
        //  LinkedHshSet extends the HashSet
        //Linked HashSet similar Construc same Hashset.
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(100);
        Set<Integer> set3 = new HashSet<>(100,0.8f);
        Set<Integer> set4 = new HashSet<>(List.of(10,20,30,40));

        //---------------- Constructors of HashMap and Linked Hashmap
        //LinkedHashMap similar it
        Map<Integer,String> map3 = new HashMap<>();
        Map<Integer,String> map4 = new HashMap<>(100);
        Map<Integer,String> map5 = new HashMap<>(100,0.8f);
        Map<Integer,String> map6 = new HashMap<>(Map.of(101,"Akash",102,"hi",103,"hello"));
         
    }
}
