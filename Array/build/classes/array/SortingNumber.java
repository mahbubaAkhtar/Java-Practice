
package array;

import java.util.Arrays;

public class SortingNumber {
    public static void main(String[] args)
    {
        int[] number={3,4,6,3,21,22,-4,-6,5};
        Arrays.sort(number);
        System.out.println("Ascending = ");
        for(int i=0;i<9;i++)
        {
            System.out.print("  "+number[i]);
        }
        System.out.println("");
        System.out.println("Descending = ");
        for(int i=8;i>=0;i--)
        {
            System.out.print("  "+number[i]);
        }
        System.out.println("");
        String[] name={"Jedni","Sarah","Kajol","Sadia","Osman","Mehedi"};
         Arrays.sort(name);
        System.out.println("Ascending = ");
        for(int i=0;i<6;i++)
        {
            System.out.printf(name[i]+ " ");
        }
        System.out.println("");
        System.out.println("Descending = ");
        for(int i=5;i>=0;i--)
        {
            System.out.printf(name[i]+ " ");
        }
        System.out.println("");
        
    }
    
}
