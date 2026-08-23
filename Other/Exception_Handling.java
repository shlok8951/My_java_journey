public class Exception_Handling {
    public static void main(String[] args) {
       try{ int a = 5;
        int b =0;
        methodA(a,b); }
        catch(Exception e){
            System.out.println("Division by 0 not allow");
        }
        System.out.println("I am good");
    }
    private static void methodA(int a , int b){
        System.out.println("hiiiiiiiiiiiiii");
        methodB(a,b);
        
    }
    private static void methodB(int a,int b ){
        System.out.println(a/b);
        System.out.println("hi");
    }

}
