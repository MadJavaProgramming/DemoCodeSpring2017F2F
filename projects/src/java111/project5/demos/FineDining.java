package java111.project5.demos;

/** A fine dining establishment 
 *  @author pwaite
 */

 public class FineDining extends Restaurant {
 
     private boolean acceptsReservations;
     
     /** Constructor to create a fine dining restaurant
     */
     public FineDining() {
         System.out.println("The Fine Dining Class Constructor");
     }

	/**

	 * Returns the value of acceptsReservations.

	 * @return whether or not the restaurant accepts reservations
	 */

	public boolean getAcceptsReservations() {

		return acceptsReservations;

	}





	/**

	 * Sets the value of acceptsReservations.

	 * @param acceptsReservations The value to assign acceptsReservations.

	 */

	public void setAcceptsReservations(boolean acceptsReservations) {

		this.acceptsReservations = acceptsReservations;

	}


	/** displays the address, name, rating and current location of the restaurant
      */
        public String toString() {
         
            return super.toString() + 
                    " and takes reservations: " + acceptsReservations;
         }

        
 }
