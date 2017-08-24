package dietester;

import java.util.Random;
import javax.swing.JOptionPane;

public class Die {

    public void rollPercentage(int numberOfRolls) 
    {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
        double percent1 = 0, percent2 = 0, percent3 = 0, percent4 = 0, percent5 = 0, percent6 = 0;
        
        for (int i = 0; i < numberOfRolls; i++) 
        {
            
            int roll = roll();
            if(roll == 1)
            {
            ++count1;
            }
            else if(roll== 2)
            {
                ++count2;
            }
            else if(roll == 3)
            {
                ++count3;
            }
            else if(roll == 4)
            {
                ++count4;
            }
            else if(roll == 5)
            {
                ++count5;
            }
            else
            {
                ++count6;
            }
        }
        
        percent1 = (count1*100.0/numberOfRolls);
        percent2 = (count2*100.0/numberOfRolls);
        percent3 = (count3*100.0/numberOfRolls);
        percent4 = (count4*100.0/numberOfRolls);
        percent5 = (count5*100.0/numberOfRolls);
        percent6 = (count6*100.0/numberOfRolls);
        
        JOptionPane.showMessageDialog(null, "The total number of rolls was: " + numberOfRolls
        + "\nThis resulted in a breakdown of rolls as follows:\n1: " + count1 + " rolls - " + percent1 + "%" + "\n2: " + count2
        + " rolls - " + percent2 + "%" + "\n3: " + count3 + " rolls - " + percent3 + "%" + "\n4: " + count4 + " rolls - " + percent4 + "%"
                + "\n5: " + count5 + " rolls - " + percent5 + "%" + "\n6: " + count6 + " rolls - " + percent6 + "%");
       
    }

    private int roll() 
    {
        Random dieRoll = new Random();
        int roll = dieRoll.nextInt(6) + 1;
        return roll;
    }

}
