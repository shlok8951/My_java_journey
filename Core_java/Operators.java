public class Operators {
     public static void main(String[] args) {
        
        //Arithmatic operator -> +,-,*,/,%
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        a += 5;
        System.out.println(a);

        a++;
        System.out.println(a);

        //prefix and postfix
        int i =10;
        i++;
        ++i;
        System.out.println(i++); //12
        System.out.println(i);//13;


        //Relational operator-> <=,>=,==,!= => answer true/false
        System.out.println(a==b);

        //Bitwise operator
        int x = 2;
        int y = 3;
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
        System.out.println(~y);

        //shift operator
       byte  p = 1;
       p = (byte)(p<<8);
       System.out.println(p);

       int q = 1;
       q = q<<33; // shift only 1 b/c 33%32 = 1;
       System.out.println(q);

       //logical operator 
        int r =  10;
        int s = 20;
        int t = 30;
        boolean w = (r>s & s<t);//false but there is not short ckt
        System.out.println(w);

        //Assign operator => =
        a = b = s = t;
        System.out.println(a);




    }

}
