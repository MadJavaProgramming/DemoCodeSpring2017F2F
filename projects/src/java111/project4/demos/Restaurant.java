/** Represents a restaurant in a system like Yelp!
 *  @author pwaite
 */

 public class Restaurant {
    private String address;
    private String name;
    private int rating;  // number of stars
    
    /** returns the value of the address
     * @return restaurant's address
     */
     public String getAddress(){
        return address;   
     }
     
     /** set the value of the address
      * @param newAddress address of the restaurant
      */
      public void setAddress(String newAddress) {
           address = newAddress;
      }
      
      /** returns the value of the name
     * @return restaurant's name
     */
     public String getName(){
        return name;   
     }
     
     /** set the value of the name
      * @param name name of the restaurant
      */
      public void setName(String name) {
           this.name = name;
      }
      /** returns the value of the rating
     * @return restaurant's rating
     */
     public int getRating(){
        return rating;   
     }
     
     /** set the value of the rating
      * @param newRating rating of the restaurant
      */
      public void setRating(int newRating) {
           rating = newRating;
      }
    
    /** displays the address, name and rating of the restaurant
      */
        public void display() {
            System.out.println("The restaurant, " + getName() + ", is located at " + address +
                " and is rated "  + rating + " star/s.");
         }

 }