
package beginnerjava;

import java.util.Scanner;

public class FahrenheitToCelvin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double fahrenheit, kelvin;
        System.out.print("Enter Your Fahrenheit Temperatur :");
        fahrenheit= input.nextDouble();
        kelvin =(fahrenheit-32)*0.56 + 273;
        System.out.println("Kelvin = " +kelvin);
        
    }
    
}
