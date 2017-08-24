package lab10;

import java.util.Random;

public class Lab10
{
    private static int[] myNumbers = new int[100];
    private static Random randomNumber = new Random();

    public static void main(String[] args)
    {
        for (int i = 0; i < myNumbers.length; i++)
        {
            myNumbers[i] = randomNumber.nextInt(100);
        }
        
        System.out.println("The numbers stored in the array are:");
        printAllNumbers();
        System.out.println();

        System.out.println("The largest number stored in this array is:");
        printLargestNumber();
        System.out.println();

        System.out.println("The average of the numbers stored in this array is:");
        printAverageNumber();
        System.out.println();

        System.out.println("The alternating numbers stored in this array are:");
        printEveryOtherNumber();
        System.out.println();

        System.out.println("The even numbers stored in this array are:");
        copyAndPrintEvenNumbers();
        System.out.println();
    }

    public static void printAllNumbers()
    {
        for (int i = 0; i < myNumbers.length; i++)
        {
            System.out.print(myNumbers[i] + ", ");
        }
        System.out.println();
    }

    public static void printLargestNumber()
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < myNumbers.length; i++)
        {
            if (myNumbers[i] > max)
            {
                max = myNumbers[i];
            }
        }
        System.out.println(max);
    }

    public static void printAverageNumber()
    {
        double average = 0, total = 0;
        for (int i = 0; i < myNumbers.length; i++)
        {
            total += myNumbers[i];
            average = total / myNumbers.length;
        }
        System.out.println(average);
    }

    public static void printEveryOtherNumber()
    {
        for (int i = 0; i < myNumbers.length; i += 2)
        {
            System.out.print(myNumbers[i] + ", ");
        }
        System.out.println();
    }

    public static void copyAndPrintEvenNumbers()
    {
        int evenCount = 0;

        for (int i = 0; i < myNumbers.length; i++)
        {
            if (myNumbers[i] % 2 == 0)
            {
                evenCount++;
            }
        }

        int[] myEvenNumbers = new int[evenCount];

        int j = 0;

        for (int i = 0; i < myNumbers.length; i++)
        {
            if (myNumbers[i] % 2 == 0)
            {
                myEvenNumbers[j] = myNumbers[i];
                j++;
            }
        }

        for (int i = 0; i < myEvenNumbers.length; i++)
        {
            System.out.print(myEvenNumbers[i] + ", ");
        }
    }

}
