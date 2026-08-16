import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection_interface {
     public static void main(String[] args) {
         Collection<Integer> list = new ArrayList<>();

        //---------- add() -> return type boolean(true/false(in hashset can return))
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        //------------ size()
        System.out.println(list.size());

        //------------ isEmpty()
        System.out.println(list.isEmpty());

        //------------ contains(Object o) -> result in true or false
        System.out.println(list.contains(2));
        System.out.println(list.contains("hi"));   //hi is also a object
        
        //------------ toArray()-> return type object so we perform only object method ,Typecast only individual element 
        Object[] obj = list.toArray();
        Integer n = (Integer)obj[0];
        // System.out.println(obj.isEmpty());
        for(Object o : obj){
           System.out.println(o);
        }

        //------------ toArray[T e]
        Integer[] ob = list.toArray(new Integer[0]);
        for(Integer i : ob){
            System.out.println(i);
        }

        //----------remove(Object o) -> for comparison and equals method
        System.out.println(list.remove(10));

        //----------- addAll() -> return boolean 
        System.out.println(list.addAll(List.of(1,2,3,4)));
        System.out.println(list);

        //----------containsAll()-> check all values
        System.out.println(list.containsAll(List.of(20,40,2,4)));
        System.out.println(list);

        //--------- removeAll()
        System.out.println(list.removeAll(List.of(30,1,3)));
        System.out.println(list);

        //----------- retainAll()
        System.out.println(list.retainAll(List.of(20,40,2)));
        System.out.println(list);

        //--------- clear()-> delete all the values 
        list.clear();
        System.out.println(list);

    }
}

        
    
    


