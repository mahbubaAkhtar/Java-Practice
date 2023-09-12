
package array;
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseOrder {
    
     public static void main(String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        
        
        number.add(8);
        number.add(2);
        number.add(5);
        number.add(-2);
        number.add(6);
        System.out.println("Number = "+number);
          
         
         //descending Oder   && use reversOrder();  method
         Collections.sort(number,Collections.reverseOrder());
         System.out.println("After sorted descending number : " +number);
         
        
    }
    
}

    

