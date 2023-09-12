
package beginnerjava;

public class MathClass {
    public static void main(String[] args)
    {
        int x=10, y=8;
        int max=Math.max(x, y);
        System.out.println("Maximum = " +max);
        int min=Math.min(x, y);
        System.out.println("Minimum = " +min);
        int j=19,s= -7;
        int absolute=Math.abs(s);
        System.out.println("Absolute of s = " +absolute);
        int a=2,b=4;
        double power = Math.pow(a,b);
        System.out.println("a to the power b = " +power);
        int round=Math.round(8.8f);
        System.out.println("Round of 8.8 = " +round);
        int round2=Math.round(8.4f);
        System.out.println("Round2 of 8.4 = " +round2);
        double pi=Math.PI;
        System.out.println("pi = " +pi);
        double square =Math.sqrt(pi);
        System.out.print("Square Root of Pi = " +square);
        
}
}
