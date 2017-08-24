/*
 * This program uses two classes to randomly generate a number representing a die roll for a user input number of times.
 * The program tracks the number of instances of the numbers 1 through 6 during these rolls and then calculates the percentage 
 * of each number to the total rolls. These results are then displayed to the user.
 * Edward Bersin : tuf18309@temple.edu
 * Last modified March 16, 2015
 */

package dietester;

import javax.swing.JOptionPane;

public class DieTester {

    public static void main(String[] args) {
        //Variable declaration and initialization for the loop
        String rolls = "";
        int answer = 0, numberOfRolls = 0;

        JOptionPane.showMessageDialog(null, "This program will roll a die a set number of times and display \nthe percentage breakdown "
                + "of the numbers rolled to the user.");
        
        //This loop runs creates an instance of the die class and runs its rollPercentage method while the user continues to select yes
        do {
            rolls = JOptionPane.showInputDialog(null, "Please enter the number of times you would like to roll the die:");

            numberOfRolls = Integer.parseInt(rolls);
            Die newGame = new Die();
            newGame.rollPercentage(numberOfRolls);

            answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", null, JOptionPane.YES_NO_OPTION);
        } while (answer == JOptionPane.YES_OPTION);
    }

}
