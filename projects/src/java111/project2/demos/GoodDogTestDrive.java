/**
 *  The GoodDog Test Drive class. We will make 3 objects of different sizes.
 *
 *@author    eknapp
 */
public class GoodDogTestDrive {
 
    /**
     *  The main program for the GoodDogTestDrive class. Why do we need a main
     *  method?
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
 
        GoodDog  dogOne    = new GoodDog();
        //dogOne.size = 70;
        dogOne.setSize(70);
 
        GoodDog  dogTwo    = new GoodDog();
        //dogTwo.size = 8;
        dogTwo.setSize(8);
 
        GoodDog  dogThree  = new GoodDog();
        //dogThree.size = 35;
        dogThree.setSize(35);
 
        dogOne.bark();
        dogTwo.bark();
        dogThree.bark();
 
    }
 
}
  
