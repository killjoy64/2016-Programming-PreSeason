/**
 * Created by Kyle Flynn on 12/9/2015.
 */
public class LocalOverGlobal {

    private Thread mainGameThread;
    private boolean isRunning;

    public LocalOverGlobal() {
        isRunning = false;
    }

    public void startGame() {
        mainGameThread = new Thread();
        isRunning = true;
        mainGameThread.start();
    }

    private void run() {
        int i = 0;
        boolean isOdd = false;
        while(isRunning) {
            i++;

            if(i % 2 == 1) {
                // The number is odd
                isOdd = true;
            } else {
                isOdd = false;
            }

            if(isOdd) {
                System.out.println(i + " is an odd number!");
            }
        }
    }

    public static void main(String[] args) {
        LocalOverGlobal gameClass = new LocalOverGlobal();

        gameClass.startGame();
    }

}
