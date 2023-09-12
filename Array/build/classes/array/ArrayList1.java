
package array;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {
    public static void main(String[] args)
    {
       ArrayList<Integer> number=new ArrayList<>();
       System.out.println("Size = " +number.size());
       //Adding Elemnents
       number.add(10);
       number.add(20);
       number.add(30);
       number.add(3,40);
       //1st way
       System.out.println(number);
       System.out.println("Size = " +number.size());
        System.out.println();
        //2nd way
       for(int x : number)
       {
           System.out.print(" "+x);
       }   
           System.out.println();
           System.out.println("Size = " +number.size());
           
           System.out.println();
           //3rd way
           Iterator itr=number.iterator();
           while(itr.hasNext())
           {
               System.out.print(" "+itr.next());
           }
           System.out.println();
           System.out.println("Size = "+number.size());
           
           //one element remove  && remove(index) method use
           number.remove(3);
           System.out.println("After removing ArrayList contain :"+number);
           //All elements remove  && removeAll(datatype) method use
           number.removeAll(number);
            System.out.println("After removing all ArrayList contain :"+number);
            
            
           
       
    }
    
}
