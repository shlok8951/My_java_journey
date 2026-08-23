import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams_Terminates {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(List.of(1,13,11,9));
        // List<Integer> list2 =  list.stream()
        //                       .map(x->x+1)
        //                       .collect(Collectors.toList());//Mutable
        //                      // .toList(); //Immutable

        // System.out.println(list2);   
        
        Optional<Integer> sum =  list.stream()
            .reduce((a,b)->a+b);
        System.out.println(sum.get());  
        
        int sum1 = list.stream()
                       .reduce(0,(a,b)->a+b); //identity is base value 
        System.out.println(sum1); 
        
        long num = list.stream()
                       .filter(x->x>10)
                       .count();
        System.out.println(num);

        Optional<Integer> num1 = list.stream()
                                     .filter(x->x>10)
                                     .findAny();
                                     //.findFirst();
        System.out.println(num1);  

        boolean num2 = list.stream()
                            .filter(x->x>10)
                            .anyMatch(x->x%2==0);
        System.out.println(num2);   
        
        

        int sum3 = list.stream()
                       .filter(x->x>10)
                       .mapToInt(x->x)
                       .sum();
        System.out.println(sum3);

        OptionalInt n = list.stream()
                             .mapToInt(x->x)
                             .max();
        System.out.println(n.getAsInt());

        //Collectors

        List<Integer> l1 = list.stream()
                               .map(x->x+1)
                               .collect(Collectors.toList());
        
        Set<Integer> l2 = list.stream()
                               .map(x->x+1)
                               .collect(Collectors.toSet());
        
        List<String> list3 = new ArrayList<>(List.of("AA","BBB","CCCC","DD","EEE"));                       
       
        Map<Integer,String> mp = list3.stream()
                               .collect(Collectors.toMap(x->x.length(),x->x));
        
       System.out.println(mp);

       Map<Integer,List<String>> mp1 = list3.stream()
                               .collect(Collectors.groupingBy(x->x.length()));
        System.out.println(mp1);                       
        
        Map<Boolean,List<String>> mp2 = list3.stream()
                               .collect(Collectors.partitioningBy(x->x.length()%2==0));
        
        
        Map<Integer,List<String>> mp3 = list3.stream()
                               .collect(Collectors.groupingBy(
                                x->x.length(),
                            Collectors.mapping(x->x.toLowerCase(), Collectors.toList())));
        System.out.println(mp3);                       
                               



        String result = list3.stream()
                          .collect(Collectors.joining("-"));

        System.out.println(result);                  

        
        






    }
}
//reduce ->combine stream elements into a singlr value
//FindFirst ->sort circuting
//findAny -> use in parallel stream , provide freedem
//AnyMAtch->
//noneMatch-> if no one satisfied the condition then true 
//sum max,min,avg ->work with primitive data types
//groubbi
//partitionningby -> divide in two parts