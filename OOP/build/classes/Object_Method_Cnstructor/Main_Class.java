
package Object_Method_Cnstructor;

public class Main_Class {
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Sadia", "Female", "01787654328");
        
        
        //teacher1.setInformation("Sadia", "Female", "01787654328");    //Parametrized Method
        
        
//        teacher1.name= "Sadia";
//        teacher1.gender= "Female";
//        teacher1.phone_No ="01789876543";
        
        teacher1.displayInformation();      // method call
        
//        System.out.println("Name : " +teacher1.name);
//        System.out.println("Gender : " +teacher1.gender);
//        System.out.println("Phone : " +teacher1.phone_No);
        
        Teacher teacher2 = new Teacher("Nusrat", "Female", "01787654328");
        
        
        //teacher2.setInformation("Nusrat", "Female", "01787654328");   //Parametrized Method call
        
//        teacher2.name= "Nusrat";
//        teacher2.gender= "Female";
//        teacher2.phone_No ="01789876543";
        
        teacher2.displayInformation();     //method call
        
//        System.out.println("Name : " +teacher2.name);
//        System.out.println("Gender : " +teacher2.gender);
//        System.out.println("Phone : " +teacher2.phone_No);

          Teacher teacher3 = new Teacher();
          teacher3.displayInformation();
    }
      
    
}
