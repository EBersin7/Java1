package arraytester;

import java.util.Scanner;

public class ArrayTester
{
    //Declaration of the array to contain Circle objects
    public static Circle[][] circleArray;
    
    public static void main(String[] args)
    {
        //Declaration and initialization of user input variables
        int rows = 0, columns = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of rows and the number of columns for this array: ");
        rows = keyboard.nextInt();
        columns = keyboard.nextInt();
        
        //Initialization of array using user input values
        circleArray = new Circle[rows][columns];
        
        //Population of all indices of array using the default constructor
        for(int i = 0; i < circleArray.length; i++)
        {
            for(int j = 0; j < circleArray[i].length; j++)
            {
                circleArray[i][j] = new Circle();
            }
        }
        
        //Calls the method to print the area of each individual entry
        printAllArea();
        
        //Calls the getLargestAreaPerRow method and uses it to calculate and print the largest area from all Circle objects created
        double max = Double.MIN_VALUE;
        double[] largestArray = getLargestAreaPerRow();
        for(int i = 0; i < largestArray.length; i++)
        {
            if(largestArray[i] > max)
            {
                max = largestArray[i];
            }
        }
        System.out.println("The largest area of all rows is " + max);
        
        //Calls the getAveragePerRow method and uses it to calculate and print the average area for all Circle objects created
        double average = 0;
        double[] averageArray = getAveragePerRow();
        for(int i = 0; i < averageArray.length; i++)
        {
            average += averageArray[i];
        }
        System.out.println("The average area of all rows is " + average/averageArray.length);
    }
    
    public static void printAllArea()
    {
        for(int i = 0; i < circleArray.length; i++)
        {
            for(int j = 0; j < circleArray[i].length; j++)
            {
                System.out.println("The area of entry [" + i + "][" + j + "] is " + circleArray[i][j].getArea() + " ");
            }
        }
    }
    
    public static double[] getLargestAreaPerRow()
    {
        double[] largestArray = new double[circleArray.length];
        
        for(int i = 0; i < circleArray.length; i++)
        {
            double max = Double.MIN_VALUE;
            for(int j = 0; j < circleArray[i].length; j++)
            {
                if(circleArray[i][j].getArea() > max)
                {
                    max = circleArray[i][j].getArea();
                }
            }
            largestArray[i] = max;
        }
        return largestArray;
    }
    
    public static double[] getAveragePerRow()
    {
        double[] averageArray = new double[circleArray.length];
        
        for(int i = 0; i < circleArray.length; i++)
        {
            double totalArea = 0;
            for(int j = 0; j < circleArray[i].length; j++)
            {
                totalArea += circleArray[i][j].getArea();
            }
            averageArray[i] = totalArea/circleArray[i].length;
        }
        return averageArray;
    }
}
