
package beginnerjava;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args)
    {
        int mark1=60,mark2=30,result;
        int number1,number2,res;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter number1 :");
        number1=input.nextInt();
        
        System.out.print("Enter number2 :");
        number2=input.nextInt();
        
        res=number1+number2;
        System.out.println("Sum :"+res);
        
        res=number1-number2;
        System.out.println("Sub :"+res);
        
        res=number1*number2;
        System.out.println("Multi :"+res);
        
        res=number1/number2;
        System.out.println("Division :"+res);
        
       res=number1%number2;
        System.out.println("Remainder :"+res);
       
        result=mark1+mark2;
        System.out.println("\n\n\n");
        System.out.println("Sum :"+result);
        
        result=mark1-mark2;
        System.out.println("Sub :"+result);
        
        result=mark1*mark2;
        System.out.println("Multi :"+result);
        
        result=mark1/mark2;
        System.out.println("Division :"+result);
        
        result=mark1%mark2;
        System.out.println("Remainder :"+result);
    }
    
            
    
}
