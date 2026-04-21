public class exception {


    public static void main(String[]args){
        f1();
    }
    
    public static void f1() 
           {
            try{
                f2();
            }
        
            catch(Exception e){
                System.out.println("Exception handled");

            }
    }
    public static void f2(){
        f3();
    }
    public static void f3(){
        System.out.println(3/0);
    }
}
