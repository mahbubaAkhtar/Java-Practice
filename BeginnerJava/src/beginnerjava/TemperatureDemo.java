
package beginnerjava;
import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
       double celsius,fahrenheit;
       System.out.print("Enter the Temperature :");
       celsius=input.nextDouble();
       fahrenheit= 1.83*celsius+32;
       System.out.println("Celsius to Fahrenheit convert :"+fahrenheit);
    }    
}
