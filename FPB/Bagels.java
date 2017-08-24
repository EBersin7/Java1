package fermipicobagelsgame;

import java.util.Random;
import java.util.Scanner;

public class Bagels 
{
    private int secretNumber, secretDigit1, secretDigit2, secretDigit3, userGuess, userDigit1, userDigit2, userDigit3;
    private static Random randomNumber = new Random();
    
    //Starts a new round of the game by generating a new number and asking the user to guess until there is a match.
    public void playGame() 
    {
        int guessCount = 1;
        String guess = "";
        Scanner keyboard = new Scanner(System.in);
        generateSecretNumber();    
        
        do
        {
            //test values
            System.out.println(secretNumber);
            System.out.println(secretDigit1);
            System.out.println(secretDigit2);
            System.out.println(secretDigit3);
            
            System.out.println("Please enter a 3 digit number between 100 and 999: ");
            guess = keyboard.next();
            
            if(isGuessCorrect(guess))
            {
                System.out.println("You guessed " + guessCount + " times");
                System.out.println("You win!");
            }
            else
            {
                printHint(guess);
                //test values
                System.out.println(userDigit1);
                System.out.println(userDigit2);
                System.out.println(userDigit3);
            }
            ++guessCount;
            
        }while(!(secretNumber == userGuess));
        //System.out.println("You guessed " + guessCount + " times");
    }
    
    
    //Generates a secret 3-digit number that the user has to guess.
    private void generateSecretNumber() 
    {
        do
        {
            secretNumber = randomNumber.nextInt(900)+100;
            secretDigit1 = secretNumber/100;
            secretDigit2 = (secretNumber%100)/10;
            secretDigit3 = (secretNumber%100)%10;
        }while((secretDigit1 == secretDigit2)||(secretDigit1 == secretDigit3)||(secretDigit2 == secretDigit3));
        
    }
    
    //Evaluate the user's guess. Return true if correct, false if not correct.
    private boolean isGuessCorrect(String guess) {
        userGuess = Integer.parseInt(guess);
        if(userGuess == secretNumber)
            return true;
        else
            return false;
    }
    
    
    //Print hints to System.out to help the user guess the correct number.
    private void printHint(String guess) 
    {
        userGuess = Integer.parseInt(guess);
        userDigit1 = userGuess/100;
        userDigit2 = (userGuess%100)/10;
        userDigit3 = (userGuess%100)%10;
        
        if((userDigit1 == secretDigit2)||(userDigit1 == secretDigit3))
        {
            System.out.print("Pico,");
        }
        if((userDigit2 == secretDigit1)||(userDigit2 == secretDigit3))
        {
            System.out.print("Pico,");
        }
        if((userDigit3 == secretDigit1)||(userDigit3 == secretDigit2))
        {
            System.out.print("Pico,");
        }
        else if((userDigit1 != secretDigit1) && (userDigit1 != secretDigit2) && (userDigit1 != secretDigit3) &&
                (userDigit2 != secretDigit1) && (userDigit2 != secretDigit2) && (userDigit2 != secretDigit3) &&
                (userDigit3 != secretDigit1) && (userDigit3 != secretDigit2) && (userDigit3 != secretDigit3))
        {
            System.out.println("Bagels");
        }
    }
}
