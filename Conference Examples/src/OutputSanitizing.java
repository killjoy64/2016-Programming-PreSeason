/**
 * Created by Kyle Flynn on 12/11/2015.
 */
public class OutputSanitizing {

    private static int MAX_SIZE = 6;

    private int[] ages;

    public OutputSanitizing() {
        ages = new int[5];

        ages[0] = 8;
        ages[1] = 2;
        ages[2] = 13;
        ages[3] = 82;
        ages[4] = 41;
    }

    public void printAges() {
        for(int i = 0; i < MAX_SIZE; i++) {
            System.out.println("Age: " + i);
        }
    }
    
    public static void main(String[] args) {
        OutputSanitizing sanitizedOutput = new OutputSanitizing();

        sanitizedOutput.printAges();
    }

}
