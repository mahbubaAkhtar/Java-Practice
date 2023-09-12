
package Returning_Value;


public class Test {
    
    public static void main(String [] args)
    {
        ReturningValueDemo s1 = new ReturningValueDemo();
        int result1= s1.square(9);
        System.out.println("Your answer is : " +result1);
        
        ReturningValueDemo s2 = new ReturningValueDemo();
        int result2= s2.square(7);
        System.out.println("Your answer is : " +result2);
    }
    
    
}
