
package beginnerjava;

public class UnaryDemo {
    public static void main(String[] args)
    {
        int x=90,y=-90,result;
        result= ++x;
        System.out.println("Result of X :"+result);
        result= --x;
        System.out.println("Result X :"+result);
        result= y++;
        System.out.println("Result Y :"+result);
        result= y--;
        System.out.println("Result Y :"+result);
    }
    
}
