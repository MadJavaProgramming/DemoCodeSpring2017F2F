/** Process restaurant class 
 *  creating a restaurant array
 *  creating restaurants and placing them in the array
 *  iterate over the array displaying the restaurants
 * 
 * @author pwaite
 */
 
 public class ProcessRestaurant {
     //instance variable for the restaurant array
     Restaurant[] restaurants;
	/**
	 * Returns the value of restaurants.
	 * @return the list of restaurants
	 */
	public Restaurant[] getRestaurants() {
		return restaurants;
	}


	/**
	 * Sets the value of restaurants.
	 * @param restaurants The value to assign restaurants.
	 */
	public void setRestaurants(Restaurant[] restaurants) {
		this.restaurants = restaurants;
	}

	
	
     

	
 
     public void setUp() {
         // instantiating the array to hold 3 restaurants
          restaurants = new Restaurant[3];
          createRestaurants();
          displayRestaurants();
     }
     
     public void createRestaurants() {
         // create a local variable to hold restaurants
         Restaurant[] localArray = new Restaurant[3];
      // instantiate restaurant objects and assign them to the slots in the array     
         localArray[0] = new Restaurant();
         localArray[1] = new Restaurant();
         localArray[2] = new Restaurant();
         
          
          // assign values to instance variables
          localArray[0].setName("Red Robin");
          localArray[0].setAddress("100 Main St, Madison, WI 53704");
          localArray[0].setRating(1);
          
          localArray[1].setName("Garmish");
          localArray[1].setAddress("100 Hwy M, Cable, WI 53783");
          localArray[1].setRating(5);
          
          localArray[2].setName("Black Iron");
          localArray[2].setAddress("100 Hwy 77, Hayward, WI 53784");
          localArray[2].setRating(4);
        
          // assign the local variable to the instance variable
          setRestaurants(localArray);
          //equivalent of restaurants = localArray;
     }
     
     public void displayRestaurants() {
          // call the display method in a for loop
          for (int counter1 = 0; counter1 < restaurants.length; counter1++) {
              restaurants[counter1].display();
              System.out.println();
          }
     }    
 
 
 }
 

