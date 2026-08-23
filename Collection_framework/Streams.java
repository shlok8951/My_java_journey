import java.util.*;
import java.util.stream.Stream;


/*
filter()
map()
flatMap()-> flatening operation
sorted()->stateful
distinct()->keep unique values(Hashing)->stateful
limit()/skip()
peek()->healpful for debugging

*/
public class Streams{
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>(List.of(11,10,32,23,4));
        // List<Integer> l1 =  list.stream().filter(x->x%2==0).map(x->x/2).toList();
        // System.out.println(l1);
        // list.stream()
        //     .filter(x->x>10)
        //     .map(x->x*2)
        //     .forEach(System.out :: println);

        // List<List<Integer>> list2 = List.of(List.of(1,2),List.of(3,4));
        // list2.stream()
        //      .flatMap(x->x.stream())
        //      .map(x->x*2)
        //      .forEach(System.out::println);
      

        list.stream()
            .filter(x->x>10)
            .map(x->x*2)
            .peek(System.out::println)
            .sorted((a,b)->b-a)
            .distinct()
            .forEach(System.out :: println);


        // Stream.iterate(1, x->x+1)
        //       .limit(10)
        //       .skip(5)   //first 5 elements are skip
        //       .forEach(System.out :: println);

    }
} 