
package Overloading_Constructor;

public class MainClass {
    
          
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("Umme Mahbuba Akhtar Jidni" , "Female");
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("Rakib Hasan Sabbir", "Male", "01611717505");
        teacher3.displayInformation();
             
        
        
  }
    
}
