package arraytester;

import java.util.Random;

public class Circle
{
    //Declaration of only instance variable of Circle
    private int radius;
    
    //Default constructor sets radius to a random integer between 10 and 100 inclusive
    Circle()
    {
        Random random = new Random();
        radius = random.nextInt(91)+10;
    }
    
    //Returns the area of each Circle object
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    
}
