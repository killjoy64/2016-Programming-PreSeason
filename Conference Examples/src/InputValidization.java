import java.util.Scanner;

/**
 * Created by Kyle Flynn on 12/9/2015.
 */
public class InputValidization {

    /*
    This is a prime example of why recursion should be avoided, as well
     */

    private String inputString;

    public InputValidization() {
        inputString = "";
    }

    public void takeInput() {
        Scanner inputScanner = new Scanner(System.in);
        inputString = inputScanner.nextLine();
    }

    public void validateInput() {
        if(inputString.matches("[0-9]")) {
            takeInput();
        }
    }

    public void printInput() {
        System.out.println("Validated input: " + inputString);
    }

    public static void main(String[] args) {
        InputValidization inputVal = new InputValidization();
    }

}
