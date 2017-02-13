/**
 *  This GoodDog class shows proper data hiding.
 *
 *@author    eknapp
 */
public class GoodDog {
 
    private int  size;
 
 
    /**
     *  Sets the size attribute of the GoodDog object
     *
     *@param  x     The new size value
     */
    public void setSize(int inputSize) {
        size = inputSize;
    }
 
 
    /**
     *  Gets the size attribute of the GoodDog object
     *
     *@return    The size value
     */
    public int getSize() {
        return size;
    }
 
 
    /**
     *  This method is the code for the bark action
     */
    void bark() {
 
        if (size > 60) {
            System.out.println("Wooof! Woooof!");
        }
        else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        }
        else {
            System.out.println("Yip! Yip!");
        }
    }
 
}
  
