
package javabasic;

public class ForEach {
    public static void main(String[] args)
    {
        String[] name={"Jedni","Sarah","Zuayria"};
        int[] number={10,20,30,40,50,60,70,80,80,100};
        int sum=0;
        for(String x : name)
        {
            System.out.println(x);
        }
        for(int y : number)
        {
            //System.out.println(y);
            sum = sum + y;
            System.out.println(" Sum is = " +sum);
            
        }
    }
    
}
