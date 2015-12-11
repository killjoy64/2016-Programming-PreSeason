/**
 * Created by Kyle Flynn on 12/9/2015.
 */
public class NoMagicNumbers {

    // Typically, you get rid of magic numbers by using a variable that's static final, to indicate that the variable is global and will not be changed
    public static final int MAX_RECURSIONS = 4;
    public static final int HOME_PRICE = 90000;

    public void countLoops() {
        int i = 0;
        while(i < MAX_RECURSIONS) {
            i++;
            System.out.println("#" + i);
        }
    }

    public void calculateLotPrice() {
        if(HOME_PRICE > 50000) {
            // Wow I can't pay for that with my freelancing money!
        } else {
            // That's right about my price range
        }
    }

}
