package java111.project5.demos;

/** A fastfood restaurant
 *  @author pwaite
 */

 public class FastFood extends Restaurant {
 
     private boolean kidsPlayArea;
     
     /** Constructor to create a fast food restaurant
     */
     public FastFood() {
         System.out.println("The FastFood Class Constructor");
     }
     
     /** Constructor to create a fast food restaurant with values for all instance variables
     * //TODO @params coming later
     */
     public FastFood(String name, String address, String rating, boolean kidsPlayArea) {
         super(name, address, rating);
         this.kidsPlayArea = kidsPlayArea;
         System.out.println("The FastFood Class Constructor");
     }




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
        public String toString() {
         
            return super.toString() + 
                    " and has a kid's play area: " + kidsPlayArea;
         }

        
 }
