import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Interface {
     public static void main(String [] args){
        List<Integer> list = new ArrayList<>();

        //----------- add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //----------- get()
        System.out.println(list.get(1));

        //------------set() -> return the previous value.
        System.out.println(list.set(2,67));
        System.out.println(list);

        //----------- addAll() -> return boolean value
        System.out.println(list.addAll(0,List.of(1,2,3,40)));
        System.out.println(list);

        //---------- remove()->return the removed value
        System.out.println(list.remove(2));
        System.out.println(list);

        //---------- indexOf()-> return -1 if index not found
        System.out.println(list.indexOf(45));

        //---------- lastIndexOf()
        System.out.println(list.lastIndexOf(40));

        //---------- ListIterator()
        ListIterator<Integer> it = list.listIterator(3);
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        //----------- of()->Immutable list
        List<Integer> l1  = List.of(100,200,300,400);
        // l1.add(34);
        // System.out.println(l1); //UnsupportedOperationException
        
        //--------- copy()->it also immutable.
        List<Integer> l2 = List.copyOf(list);
        //System.out.println(l2.add(3));

        

    }
}
