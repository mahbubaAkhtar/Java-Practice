
package array;
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList {
    public static void main(String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        
        
        number.add(8);
        number.add(2);
        number.add(5);
        number.add(-2);
        number.add(6);
        System.out.println("Number = "+number);
          
        //Ascending Oder   && use Collections.sort();  method
         Collections.sort(number);
         System.out.println("Atrer Sorted The Ascending Number = " +number);
         
         //descending Oder   && use reversOder();  method
         Collections.sort(number,collections.reverseOder());
        
    }
    
}
