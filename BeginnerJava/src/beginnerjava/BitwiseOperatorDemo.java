
package beginnerjava;

public class BitwiseOperatorDemo {
    
    public static void main(String[] args)
    {
        int a=32,b=12,c;
        c = a & b;
        System.out.println(" a&b="+c)
        ;
        c = a | b;
        System.out.println(" a|b="+c)
        ;
        c = a ^ b;
        System.out.println(" a^b="+c)
        ;
        c = a >> 3; // 32 k 2 diye 3 bar divided
        System.out.println(" a >> 3="+c)
        ;
        
         c = a << 3; // 32 k 3 bar multy. Thats means 32*2=64,64*2=128,128*2=256
        System.out.println(" a << 3="+c)
        ;
       
    }
    
}
