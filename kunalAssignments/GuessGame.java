package kunalAssignments;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessGame {

    // private int user_score;
    // private int comp_score;
    int user_score = 0;
    int comp_score = 0;

    public void vaidateGuess(int comp_generated, int user_guess) {
        if (user_guess == comp_generated) {
            user_score += 1;
        } else {
            comp_score += 1;
        }
        System.out.println("computer score is :" + comp_score);
        System.out.println("user score is :" + user_score);
        // if computer generated value is equals to user guess, then increase score
    }
    public int getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int user_guess = Integer.parseInt(br.readLine());
        return user_guess;
    }
    public void validateWinner() throws IOException {
       
            if (comp_score > user_score) {
                System.out.println("computer won");
            } else {
                System.out.println("user won");
            }    
    }
    public static void main(String[] args) throws IOException {
        GuessGame game = new GuessGame();
        while (true) {
            int comp_generated = (int) (Math.random() * 6);
            int user_guess = game.getInput();
            game.vaidateGuess(comp_generated, user_guess);
            
            if(user_guess ==-1){
                game.validateWinner();
                break;
            }
            
            // call the method validateGuess()
            

            // if the user input is -1 then exit the game and display the scores of computer
            // and user
            // and also who won the game -- user won the game or computer won the game
        }

    }
}
