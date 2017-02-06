/** The testdrive class for the Restaurant System 
 *  @author pwaite
 */
 
 public class RestaurantTestDrive {
 
    /** main method for the Restaurant System
      * 1.  instantiate/create a restaurant object
      * 2.  assign values to the instance variables
      * 3.  call the display method on the restaurant
      * @param args the command line arguments
      */
      public static void main(String[] args) {
          // create a Restaurant object
          Restaurant restaurant1 = new Restaurant();
          
          // assign values to instance variables
          restaurant1.name = "Red Robin";
          restaurant1.address = "100 Main St, Madison, WI 53704";
          restaurant1.rating = 1;
          
          // call the display method
          restaurant1.display();
        } 
 }
