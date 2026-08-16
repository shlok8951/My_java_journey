public class Type_Casting {
    
    public static void main(String[] args) {
        //inplicit typecasting->automatic type comnversion 
        byte b = 120;
        int i = b;
        System.out.println(i);

        char ch = 'a';
        int c = ch;
        System.out.println(c);

        //Explicit type casting
        int x = 300;
        byte y = (byte)x;
        System.out.println(y);

        //Type permotion 
        float f = 23.78f;
        int a = (int)f;
        System.out.println(a);
    }
}