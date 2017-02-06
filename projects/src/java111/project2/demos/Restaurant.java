/** Represents a restaurant in a system like Yelp!
 *  @author pwaite
 */

 public class Restaurant {
 
    String address;
    String name;
    int rating;  // number of stars
    
    /** displays the address, name and rating of the restaurant
      */
        public void display() {
            System.out.println("The restaurant, " + name + ", is located at " + address +
                " and is rated "  + rating + " star/s.");
         }
  
 }
