package Question6;

/**
 * Created by TXS0403 on 5/9/2017.
 */
public class TestScores {
    public static void main(String[] args) {
        //setting the score
        int score = 101;
        //using if/else if/else to print the score and corresponding Letter Grade
        if(score >= 90){
            System.out.println("Your score of " +score+ " got you a A.");
        }
        else if(score >= 80 && score <=89){
            System.out.println("Your score of " +score+ " got you a B.");
        }
        else if(score >= 70 && score <=79){
            System.out.println("Your score of " +score+ " got you a C.");
        }
        else if(score >= 60 && score <=69){
            System.out.println("Your score of " +score+ " got you a D.");
        }
        else {
            if (score >= 0)
                System.out.println("Your score of " +score+ " got you a F.");
        }
    }
}
