
package datatype;
public class FormatSpecifier {
    
     public static void main(String[] args) {
        boolean b=true;
        char j='s';
        int num=1907;
        short d=3256; //dynamic initializatinon
        float f=19.7f;
        double g=99.7;
        System.out.printf("The boolean b = %b\n",b);
        System.out.printf("The charecter j = %c\n",j);
        System.out.printf("The number num = %d\n", num);
        System.out.printf("The short d = %d\n", d);
        System.out.printf("The float f = %.2f\n", f);
        System.out.printf("The double g = %.3f\n", g);
    
}
}
