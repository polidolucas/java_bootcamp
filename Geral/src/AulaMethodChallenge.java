import java.util.concurrent.LinkedTransferQueue;

public class AulaMethodChallenge {
    public static void main(String[] args) {

        String name = "Lucas";
        int highScorePosition = calculateHighScorePosition(1000);

        displayHighScorePosition("Bob", highScorePosition);

    }

    public static void displayHighScorePosition(String name, int highScorePosition){
        System.out.println(name + " managed to get into position " + highScorePosition + " on the high score list");

    }

    public static int calculateHighScorePosition(int highScorePosition){
        if (highScorePosition >= 1000){
            return 1;
        } else if (highScorePosition >= 500 & highScorePosition < 1000) {
            return 2;
        } else if (highScorePosition >= 100 & highScorePosition < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
