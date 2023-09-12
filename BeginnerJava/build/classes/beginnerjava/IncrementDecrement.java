
package beginnerjava;

public class IncrementDecrement {
    public static void main(String[] args)
    {
        int x=25,y;
        y = x++; //post increment
        System.out.println("Y ="+y);
         y=x;
        System.out.println("Y ="+y);
        
        int j=19,s;
        s= ++j; // pre increment
        System.out.println("S ="+s);
        s=j;
        System.out.println("S ="+s);
        
        int r=7,m;
        m= r--;   //post decrement
        System.out.println("M ="+m);
        m=r;
        System.out.println("M ="+m);
        
        int a=30,b;
        b= --a;   //pre decrement
        System.out.println("B ="+b);
        b=a;
        System.out.println("B ="+b);
        
        
    }
    
}
