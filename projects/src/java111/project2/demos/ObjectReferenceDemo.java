/** Demo of Object References
  * @author pwaite
  */
  
  public class ObjectReferenceDemo {
  
      /** main method will create and display a few Restaurant
       * @param args the command line arguments
       */
       public static void main(String[] args) {
       
           Restaurant restaurant1 = new Restaurant();
           Restaurant restaurant2 = new Restaurant();
           
           restaurant1.setName("McDonalds");
           restaurant2.setName("Culvers");
           
           //display the restaurants
           System.out.print("Restaurant1 is : ");
           restaurant1.display();
           System.out.print("Restaurant2 is : ");
           restaurant2.display();
           
           // create a 3rd restaurant variable
           Restaurant restaurant3 = restaurant2;
         
           //display the restaurants
           System.out.println();
           System.out.println("Adding a 3rd restaurant variable");
           System.out.print("Restaurant1 is : ");
           restaurant1.display();
           System.out.print("Restaurant2 is : ");
           restaurant2.display();
           System.out.print("Restaurant3 is : ");
           restaurant3.display();
           
           restaurant3.setName("Chick-Fil-A");
           
           //display the restaurants
           System.out.println();
           System.out.println("Adding a 3rd restaurant variable");
           System.out.print("Restaurant1 is : ");
           restaurant1.display();
           System.out.print("Restaurant2 is : ");
           restaurant2.display();
           System.out.print("Restaurant3 is : ");
           restaurant3.display();
           
           Restaurant restaurant4 = null;
           restaurant4.setName("BlackIron");
           
           
       }
  
  }
