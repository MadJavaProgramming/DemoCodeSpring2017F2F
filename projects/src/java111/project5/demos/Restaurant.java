package java111.project5.demos;

/** Represents a restaurant in a system like Yelp. 
 *  <ol>
    <li>Some thing</li>
    <li>Some other thing</li>
    </ol>
 *  @author pwaite
 */

 public abstract class Restaurant implements Rateable {
    private String address;
    private String name;
    private String rating;  // number of stars
    public static int count;
    
    /** Constructor to create a restaurant
     */
     public Restaurant() {
         count++;
         //System.out.println("The Restaurant Class Constructor");
     }
     
     /** Constructor to create a restaurant
       * @param name name of the restaurant
       * @param address address of the restaurant
       * @param rating rating of the restaurant 1-5
     */
     public Restaurant(String name, String address, String rating) {
         this();
         System.out.println("The Restaurant Class Constructor");
         this.name = name;
         this.address = address;
         this.rating = rating;
     }
    
    /** returns the value of the address
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
     public String getRating(){
        return rating;   
     }
     
     /** set the value of the rating
      * @param newRating rating of the restaurant
      */
      public void setRating(String newRating) {
           rating = newRating;
      }
      
      public String toString() {
          return "The restaurant, " + this.name + ", is located at " + this.getAddress() +
                    " and is rated "  + getRating() + " star/s";
      }
    
  
 }