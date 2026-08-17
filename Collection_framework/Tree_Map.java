import java.util.*;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<Integer,String>  map = new TreeMap<>();
        map.put(1, "hi");
        map.put(3, "hello");
        map.put(2, "hi");

        // ---------------- Sortedd Map
        System.out.println(map.firstKey()); //=>1
        System.out.println(map.lastKey());  //=>3

        System.out.println(map.firstEntry());  // => 1,hi
        System.out.println(map.lastEntry());  //=> 3,hello

        System.out.println(map.headMap(3)); //=> 1,2 
        System.out.println(map.tailMap(2)); //=>2,3

        System.out.println(map.subMap(1, 3));  //=> 1,2

        //----------Navigated map

        System.out.println(map.lowerKey(2));// => 1
        System.out.println(map.lowerEntry(3)); // =>2,hi

        System.out.println(map.floorKey(3));  //=> 3
        System.out.println(map.floorEntry(2)); //2,hi

        System.out.println(map.pollFirstEntry());  //=> 1,hi
        System.out.println(map.pollLastEntry());   // =>3,hello

        System.out.println(map.descendingKeySet()); // => 2
        System.out.println(map.descendingMap());   //=>2,hi


        System.out.println(map.headMap(1, false)); 

    }
}
