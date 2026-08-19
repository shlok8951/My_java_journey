import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.math.*;

public class Functional_interfaces {
    /*
      4 core interfaces
      1.Function
      2.Consumer
      3.Supplyer
      4.Predicate
    */
   public static void main(String[] args) {
    // Function<Integer,Integer> square = x->x*x; //there may be perform unboxing,operation,Autoboxing
    // System.out.println(square.apply(5));

    // Consumer<Integer> print = x->System.out.println(x);
    // print.accept(23);
    
    // Supplier<Double> rnadomvlue = ()->Math.random();
    // System.out.println(rnadomvlue.get());

    // Predicate<Integer> isEven = x->x%2==0;
    // System.out.println(isEven.test(5));
 
    List<Integer> list = new ArrayList<>(List.of(10,20,304,05));
    list.forEach(x->System.out.println(x));
    list.forEach(System.out::println );

   //------------ Premitive Functional inteface


 
   }
    
}
