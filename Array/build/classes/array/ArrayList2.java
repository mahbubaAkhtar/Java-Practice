
package array;
import java.util.ArrayList;

public class ArrayList2 {
   public static void main(String[] args)
   {
        ArrayList<Integer> number=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
       System.out.println("Size = " +number.size());
       //Adding elements
       number.add(10);
       number.add(20);
       number.add(30);
       number.add(3,40);
       System.out.println(number);
       System.out.println("Size = " +number.size());
       //clearing elements  && clear() method use
       number.clear();
       System.out.println("After clearing ArrayList contain: " +number);
       System.out.println();
       //Adding elements
       num.add(50);
       num.add(60);
       num.add(70);
       num.add(3,80);
       System.out.println(num);
       System.out.println("Size = " +num.size());
      
       //search any element   & use contains() method
       boolean element=num.contains(60);
       System.out.println("60 is the list : " +element);
       
       //search the element index number & use indexof() method
       int position=num.indexOf(70);
       System.out.println("The index of 70 = "+position);
       System.out.println();
       //replace any value of the list  & use set(index, new value) method
       num.set(2, 100);
       System.out.println("After setting value = "+num);
       
       //See any index number value  & use get(index) method
       int x=num.get(0);
       System.out.println("Index 0= "+x);
       System.out.println();
      
       // isEmpty method use
       boolean check=num.isEmpty();
       System.out.println("ArrayList empty :" +check);
       num.clear();
       boolean s=num.isEmpty();
       System.out.println("ArrayList empty :" +s);
       
   }
    
}
