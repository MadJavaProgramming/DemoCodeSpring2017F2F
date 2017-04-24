package java111.project5.demos;

/** A food cart 
 *  @author pwaite
 */

 public class FoodCart extends Restaurant {
 
     private String location;
     
     /** Constructor to create a food cart
     */
     public FoodCart() {
         System.out.println("The Food Cart Class Constructor");
     }

	/**

	 * Returns the value of location.
	 * @return location

	 */

	public String getLocation() {

		return location;

	}





	/**

	 * Sets the value of location.

	 * @param location The value to assign location.

	 */

	public void setLocation(String location) {

		this.location = location;

	}

	/** displays the address, name, rating and current location of the restaurant
      */
        public String toString() {
         
            return super.toString() + " and is currently located at: " + location;
         }

        
 }
