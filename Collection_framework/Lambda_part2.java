public class Lambda_part2{
    public static void main(String[] args) {
        // Calculator c = new Addition();
        // int sum  = c.calculate(12, 45);
        // System.out.println(sum);

        Calculator c1 = (a,b)->a+b;
        print(10,20,(a,b)->a+b); //Lambda function
        print(10,20,c1);
    }
    public static void print(int a, int b , Calculator c){
        System.out.println(c.calculate(a, b));
    }
}
@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}
class Addition implements Calculator{
    @Override
    public int calculate(int a, int b){
        return a+b;
    }
}