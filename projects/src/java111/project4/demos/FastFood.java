/** A fastfood restaurant
 *  @author pwaite
 */

 public class FastFood extends Restaurant {
 
     private boolean kidsPlayArea;
	/**
	 * Returns the value of kidsPlayArea.
	 * @return indicator whether or not the establishment has a kid's play area.
	 */
	public boolean getKidsPlayArea() {
		return kidsPlayArea;
	}


	/**
	 * Sets the value of kidsPlayArea.
	 * @param kidsPlayArea The value to assign kidsPlayArea.
	 */
	public void setKidsPlayArea(boolean kidsPlayArea) {
		this.kidsPlayArea = kidsPlayArea;
	}

	
	
	
     
	/** displays the address, name, rating and current location of the restaurant
      */
        public void display() {
         
            System.out.println("The restaurant, " + getName() + ", is located at " + getAddress() +
                " and is rated "  + getRating() + " star/s");
            System.out.println(" and has a kid's play area: " + kidsPlayArea );
         }

        
 }
