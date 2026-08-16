public class Variable {
    public static void main(String[] args) {
          //premitive data types
        byte b = 10;
        short s = 100;
        int i =  1000;
        long l = 100000;
        float f = 23.12456789f; //after decimal 6 digits prinit.
        double d = 45.98_122_345_677_892_35; //after decimal 14 values are print.
        double m = 6.022e23;
        char c ='A'; //A->integer ->binory ->store

        boolean k = true;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(m);
        System.out.println(c);
        System.out.println(k);

        //Number SYstem
        int a =  0b101; 
        System.out.println(a);

        int o = 034;
        System.out.println(o);

        int x = 0X23AB;
        System.out.println(x);

        //Negative values and floting values
        byte z = -42;
        System.out.println(z);

        float num = 0.7f;
        System.out.printf("%.20f%n",num);
    }
}

    

