import java.util.*;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(60);
        set.add(50);

        // // ------- SorteedSet Interface
        System.out.println(set.first());  //smallest value =>10
        System.out.println(set.last()); //largest value => 60

        System.out.println(set.headSet(50)); //strictly smaller values then given no =>[10,20,30,40]
        System.out.println(set.tailSet(50)); //large no whith including given no => [50,60]
       
        //fromElement is inclusive and toElement is exclusive
        System.out.println(set.subSet(20, 50));  // =>[20,30,40]



        //------------ Navigable Set Interface

        System.out.println(set.lower(30)); //largest no smaller then =>20

        System.out.println(set.floor(30)); //gretest element less then or equal to =>30

        System.out.println(set.higher(10));//smallest no greter then 10 =>20

        System.out.println(set.ceiling(10)); // =>10

        System.out.println(set.pollFirst()); // => remove the smallest value from set => 10

        System.out.println(set.pollLast()); // => remove largest value => 60
        System.out.println(set);

        System.out.println(set.descendingSet()); // => reverse order 

        Iterator<Integer> it = set.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //more control of including and excluding
        System.out.println(set.headSet(20, true)); 

        System.out.println(set.tailSet(15, false));

        System.out.println(set.subSet(10, false, 50, false));
        
        
    }
    
}
