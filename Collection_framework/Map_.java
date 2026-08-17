import java.util.*;

public class Map_ {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Rohit");
        map.put(102,"Rohan");
        map.put(103,"Shlok");

        System.out.println(map.size());  // => 3
        System.out.println(map.isEmpty());  // => false

        System.out.println(map.containsKey(101));  // => true
        System.out.println(map.containsValue("Shlok"));   // => true

        System.out.println(map.get(101));  //=>Rohit
        System.out.println(map.put(103, "mahesh"));  // => Shlok

        System.out.println(map.remove(102));  //=> Rohan

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1, "hi");
        map.putAll(map2);

        //map.clear();

       System.out.println( map.keySet()); // [1,101,103]
       System.out.println(map.values());  // [hi,Rohit ,Mahesh]

       Set<Map.Entry<Integer,String>> entries = map.entrySet();  
       System.out.println(entries);

          System.out.println(map.getOrDefault(104,"Unknown")); //if not key return Unknown not null

          System.out.println(map.putIfAbsent(104, "Rahul")); //it not replace value, if there key not exist it create new key value pair.

          System.out.println(map.putIfAbsent(103, "MAnav"));  // Not change value from mahesh -> MAnav
          System.out.println(map);

          System.out.println(map.remove(101,"Rohit")); //if both match then remove => true

          System.out.println(map.replace(1, "Sonu")); //if key not exist it do nothing => hi

          System.out.println(map.replace(1,"Sonu","Shivani"));//if key value exist in map then replace by new value => true

          Set<Map.Entry<Integer,String>> entry = map.entrySet();
          for(Map.Entry<Integer,String> e : entry){
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println(key + " : "+value);
          }

        //Immutable map
       Map<Integer,String> map4 = Map.of(101,"Aditya",102 ,"Ram");
       // map4.put(102,"jhbcud"); //Throw exception


      



    }
}
