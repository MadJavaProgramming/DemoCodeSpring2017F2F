/** A food cart 
 *  @author pwaite
 */

 public class FoodCart extends Restaurant {
 
     private String location;

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
        public void display() {
            System.out.println("The restaurant, " + getName() + ", with mailing address " + getAddress() +
                " and is rated "  + getRating() + " star/s" + " and is currently located at: " + location );
         }



	
 
 }
