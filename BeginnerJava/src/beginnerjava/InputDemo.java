
package beginnerjava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name,address;
        System.out.print("Enter your name :");
        name=input.nextLine();
        System.out.println("My name is : " +name);
        System.out.print("Enter your address :");
        address=input.nextLine();
        System.out.println("My Address is :"+address);
        
        int number;
        System.out.print("Enter your number:");
        number=input.nextInt();
        System.out.println("My number is  :"+number);
        

        
    }


    }
    
