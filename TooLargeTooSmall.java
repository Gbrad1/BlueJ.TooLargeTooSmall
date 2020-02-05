
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author Giles Bradford
 * @version 1.0 5-Feb-2020
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
      if (this.chosenNum == g){
        return 0;
      } else if (this.chosenNum > g) {
          return -1;
      } else {
          return 1;
      }
   }
}
