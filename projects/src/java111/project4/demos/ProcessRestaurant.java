import java.util.*;

/** Process restaurant class 
 *  creating a restaurant array
 *  creating restaurants and placing them in the array
 *  iterate over the array displaying the restaurants
 * 
 * @author pwaite
 */
 
 public class ProcessRestaurant {
     //instance variable for the restaurant array
     //Restaurant[] restaurants;

     ArrayList<Restaurant> restaurants;

	/**

	 * Returns the value of restaurants.

	 * @return the list of restaurants
	 */

	public ArrayList<Restaurant> getRestaurants() {

		return restaurants;

	}





	/**

	 * Sets the value of restaurants.

	 * @param restaurants The value to assign restaurants.

	 */

	public void setRestaurants(ArrayList<Restaurant> restaurants) {

		this.restaurants = restaurants;

	}

 
     public void setUp() {
         // instantiating the array to hold 3 restaurants
         // restaurants = new Restaurant[3];
          restaurants = new ArrayList<>();// the type is not required, it is inferred from the variable declaration
          // ArrayList<Restaurant>
          createRestaurants();
          displayRestaurants();
     }
     
     public void createRestaurants() {
         // create a local variable to hold restaurants
         ArrayList<Restaurant> localArrayList = new ArrayList<Restaurant>();
      // instantiate restaurant objects and assign them to the slots in the array     
         Restaurant restaurant1 = new Restaurant();
         Restaurant restaurant2 = new Restaurant();
         FoodCart restaurant3 = new FoodCart();
         
          
          // assign values to instance variables
          restaurant1.setName("Red Robin");
          restaurant1.setAddress("100 Main St, Madison, WI 53704");
          restaurant1.setRating(1);
          
          restaurant2.setName("Garmish");
          restaurant2.setAddress("100 Hwy M, Cable, WI 53783");
          restaurant2.setRating(5);
          
          restaurant3.setName("Carracas");
          restaurant3.setAddress("100 Hwy 77, Hayward, WI 53784");
          restaurant3.setLocation("Square");
          restaurant3.setRating(4);
          
          localArrayList.add(restaurant1);
          localArrayList.add(restaurant2);
          localArrayList.add(restaurant3);
        
          // assign the local variable to the instance variable
          setRestaurants(localArrayList);
          //equivalent of restaurants = localArray;
     }
     
     public void displayRestaurants() {
          // call the display method in a for loop
         /* for (int counter1 = 0; counter1 < restaurants.size(); counter1++) {
              //restaurants[counter1].display();
              //restaurants.get(counter1).display();
              // line above is the same as the following 2 lines
              Restaurant restaurant = restaurants.get(counter1);
              restaurant.display();
              System.out.println();
          }*/
          
          for (Restaurant myRestaurant : restaurants) {
              myRestaurant.display();
              System.out.println();
          }
     }    
 
 
 }
 

