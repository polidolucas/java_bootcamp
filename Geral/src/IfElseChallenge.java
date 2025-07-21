public class IfElseChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

//        if (score < 5000 && score > 1000){
//            System.out.println("your score was less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("your score was less than 1000");
//        } else {
//            System.out.println("got here");
//        }

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final scora was " + finalScore);
        }
    }
}
