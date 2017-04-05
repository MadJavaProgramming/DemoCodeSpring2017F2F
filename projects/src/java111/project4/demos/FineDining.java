/** A fine dining establishment 
 *  @author pwaite
 */

 public class FineDining extends Restaurant {
 
     private boolean acceptsReservations;
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
        public void display() {
         
            System.out.println("The restaurant, " + getName() + ", is located at " + getAddress() +
                " and is rated "  + getRating() + " star/s");
            System.out.println(" and takes reservations: " + acceptsReservations );
         }

        
 }
