import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functional_Composition {
    public static void main(String[] args) {
        Function<Integer,Integer> equation = x->((x+2)*3);
        System.out.println(equation.apply(4));


        Function<Integer,Integer> add = x->x+2; //f(x)
        Function<Integer,Integer> multy = x->x*3; //g(x)
        Function<Integer,Integer> divide = x->x/2; 

        int a = add.apply(4);
        int b = multy.apply(a);
        System.out.println(b);

        System.out.println(multy.apply(add.apply(4)));//g(f(x))

        int ans = add.andThen(multy).andThen(divide).apply(4);
        System.out.println(ans);

        System.out.println(add.compose(multy).apply(3));

        //predictae

        Predicate<Integer> isGreadter = x->x>100;
        Predicate<Integer> isEven = x-> x%2==0;

        System.out.println(isGreadter.and(isEven).test(500));
        System.out.println(isGreadter.or(isEven).test(13));
        System.out.println(isEven.negate().test(4));

        Predicate<Student> isAdult = x->x.age>=18;
        Predicate<Student> passed  = s->s.marks>=40;

        Predicate<Student> isEligible = isAdult.and(passed);
        System.out.println(isEligible.test(new Student(56,23)));

        Consumer<String> printName = System.out::println;
        Consumer<String> PrintUpper  = s->System.out.println(s.toUpperCase());
        
        Consumer<String> pipline = printName.andThen(PrintUpper);
        pipline.accept("Shlok");
        
    }
    
}
class Student{
        int marks;
        int age;

        public Student( int marks,int age){
            this.marks = marks;
            this.age = age;
            
        }

}
