package com.company;

import java.util.Scanner;

public class Wordgame {
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Deadliest Word Game Ever");
        System.out.println("Utilizing Java we made a game that kills");
        playGame();
    }

    static void restartGame(){
        System.out.println("Do you want to restart Game ? y - yes || n - no ");
        String userAnswer = new Scanner(System.in).next();
        switch(userAnswer){
            case"y":{
                playGame();
            }
            break;
            case"n":{
                System.out.println("Thanks For Playing The Game");
            }
        }
    }

    static void playGame() {
        System.out.println("Enter Secret Code - Don't Let Anyone Know");
        String secretWord = new Scanner(System.in).next();
        System.out.println("The Secret Word Just Lost Its Letter" +
                "The Word Needs Help Getting All Its Constants and Vowels");
        System.out.println("Will You Help ? enter yes or no ");
        String willHelp = new Scanner(System.in).next();

        System.out.println("playing");
        Integer numberOfGuesses = secretWord.length();
        System.out.println("you have : " + numberOfGuesses + "guesses");
        int correct = 0;
        int guess = 0;
        while (guess < numberOfGuesses) {
            System.out.println("Guessing enter a letter");
            String guessedChar = new Scanner(System.in).next();
            if (secretWord.contains(guessedChar)) {
                System.out.println(" B you Guessed it ");
                correct++;
            }

            guess++;
        }
        System.out.println("You have guessed:" + correct);
        if (correct == numberOfGuesses) {
            System.out.println("You Win. Try with a much bigger Word next Time");
        }
        System.out.println("Game Over");
        //Enter code here for the restart of the game
        restartGame();



        }

    }
