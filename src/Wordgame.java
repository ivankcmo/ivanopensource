import java.util.Scanner;

public class Wordgame {
    public static void main(String[] args) {
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("------- loading");
        System.out.println("--------------- loading");
        System.out.println("----------------------- loading");
        System.out.println("------------------------------- loading");
        System.out.println("--------------------------------------- loading");
        System.out.println("----------------------------------------------- loading");
        System.out.println("------------------------------------------------------- loading");
        System.out.println("--------------------------------------------------------------- loading");
        System.out.println("----------------------------------------------------------------------- loading");
        System.out.println("------------------------------------------------------------------------------- loading");
        System.out.println("done");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome to The Deadliest Word Game Ever");
        System.out.println("Utilizing Java We Made A Game That Kills");
        playGame();
    }

    static void restartGame(){
        System.out.println("Do You Want To Restart Game ? y - yes || n - no ");
        String userAnswer = new Scanner(System.in).next();
        switch (userAnswer) {
            case "y": {
                playGame();
            }
            break;
            case "n": {
                System.out.println("Thanks for playing the game");
            }
        }
    }

    static void playGame(){

        System.out.println("Enter Secret Word - Don't let anyone know");
        String secretWord = new Scanner(System.in).next();
        System.out.println("The Secret just lost its letters " +
                "The word needs help getting all of its constants and vowels");
        System.out.println("Will you help ? enter yes or no ");
        String willHelp = new Scanner(System.in).next();
        //if (willHelp.toLowerCase() == "yes") {
        System.out.println("playing");
        int numberOfGuesses = secretWord.length();
        System.out.println("you have : " + numberOfGuesses + " guesses");
        int correct = 0;
        int guess = 0;
        while (guess < numberOfGuesses) {
            System.out.println("Guessing enter a letter");
            String guessedChar = new Scanner(System.in).next();
            if (secretWord.contains(guessedChar)) {
                System.out.println(" B You Guessed It ");
                correct++;
            }

            guess++;
        }
        System.out.println("You Have guessed: +correct");
        //} else if (willHelp.toLowerCase() == "no") {
        //  System.out.println("Really ? - You Died");
        if (correct == numberOfGuesses) {
            System.out.println("You Win. Try with a bigger word next time");
        }
        System.out.println("Game Over");
        //enter code here for the restart of the game
        restartGame();
    }

  }



