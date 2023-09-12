
package conditionalstatement;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.println("Enter your age : ");
        age=input.nextInt();
        int sex,marital_status;
        
        System.out.println("Enter your sex: ");
        sex = input.next().charAt(0);
        
        System.out.println("Enter your marital_status");
        marital_status = input.next().charAt(0);
       
        if(sex == 'F') 
        {
	   System.out.println("She will be work only in urban areas");
	}

	if((sex == 'M') || ((age >= 20) && (age < 40))) 
        { 
	   System.out.println("He will work anywhere");
	}
	else if((sex == 'M') ||(age >= 40) && (age < 60))
        {
	    System.out.println("He will work only in urban areas");
	}
	else 
        {
	    System.out.println("ERROR");
	}        
        
    }
    
}
