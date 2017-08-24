/*
 *
 *
 * 
 */
package fermipicobagelsgame;

import java.util.Scanner;

public class FermiPicoBagelsGame {
    
    public static void main(String[] args) 
    {
        String response = "";
        Scanner keyboard = new Scanner(System.in);
        Bagels newGame = new Bagels();
        System.out.println("This game will generate a random 3 digit number. "
                + "\nIt is up to you to guess this number based on provided hints.");
        
        do
        {
            newGame.playGame();
            System.out.println("Would you like to play again? Please enter yes or no.");
            response = keyboard.next();
        }while(response.equalsIgnoreCase("yes"));
        
        System.out.println("Thanks for playing!");
    }
    
}
