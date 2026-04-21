public class inheritance{
    public static void main(String[] args) {
        // case 1 
        //ref var -> parent and constructor -> parent
        // parent p = new parent();
        // System.out.println(p.a);
        // System.out.println(p.b);



        // case 2
        //ref var -> child and constructor -> child

         //child c = new child();
         //c.fun5();
        //  System.out.println(c.common);
        //  System.out.println(((parent)(c)).common); //use this method also
        // System.out.println(c.a);
        // System.out.println(c.b);
        // System.out.println(c.c);
        // System.out.println(c.d);

        // c.fun1();
        // c.fun2();
        // c.fun3();
        // c.fun4();


        // case 3
        // ref var-> parent and constructor -> child
         //parent p = new child();
        // child c = (child) p; // typecasting
        // System.out.println(c.common);
        // System.out.println(p.common);
       // p.fun5();

        
    }
}