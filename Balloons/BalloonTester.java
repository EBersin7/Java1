/*
 * Edward Bersin : tuf18309@temple.edu
 * This program creates two objects of the balloon class and then sets their colors and altitudes
 * to various values. The equals method of the balloon class then checks the two objects equality.
 * Last modified April 6, 2015
 */

package balloontester;

public class BalloonTester 
{

    public static void main(String[] args) 
    {
        //Creates two objects of the balloon class
        Balloon s1 = new Balloon();
        Balloon s2 = new Balloon();
        
        //Sets the colors and altitudes of the created objects
        s1.setColor("Red");
        s1.increaseAltitude(50);
        s2.setColor("Blue");
        s2.increaseAltitude(s1.getAltitude()*2);
        
        //Calls the printEquality method and gives it the equals method of the Balloon class as its parameter
        printEquality(s1.equals(s2));
        
        //Sets the colors and altitudes of the created objects
        s2.setColor("red");
        s2.increaseAltitude(-(s2.getAltitude()/10)*9);
        s1.increaseAltitude(-150);
        s1.increaseAltitude(10);
        
        //Calls the printEquality method and gives it the equals method of the Balloon class as its parameter
        printEquality(s2.equals(s1));
    }
    
    static void printEquality(boolean equals)
    {
        if(equals)
        {
            System.out.println("These two balloons are the same!");
        }
        else
        {
            System.out.println("These two balloons are not the same!");
        }
    }
    
}
