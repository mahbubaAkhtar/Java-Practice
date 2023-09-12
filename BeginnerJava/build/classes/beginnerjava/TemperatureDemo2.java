
package beginnerjava;
import java.util.Scanner;

public class TemperatureDemo2 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double fahrenheit,celsius;
        System.out.print("Enter the Temperatur :");
        fahrenheit= input.nextDouble();
        celsius= 0.5*(fahrenheit-32);
        System.out.println("Fahrenheit to Celsius convert :"+celsius);
        
    }
    
}
