/*
 * Edward Bersin : tuf18309@temple.edu
 * This program is designed to determine the type of triangle created by user
 * entered values and then determine the area of said triangle. It will then 
 * display the area and the type of triangle to the user.
 * Due Date : March 1st @ 11:59pm
 */

package areaoftriangles;

import javax.swing.JOptionPane;

public class AreaOfTriangles 
{
    public static void main(String[] args) 
    {
        //Declaration and initialization of variables
        int sideA = 0, sideB = 0, sideC = 0;
        double triangleArea = 0, halfPerimeter = 0;
        
        //Gathering of triangle side lengths from the user and conversion to int
        String sideLength = JOptionPane.showInputDialog(null, "Please enter one side length of a triangle:");
        sideA = Integer.parseInt(sideLength);
        sideLength = JOptionPane.showInputDialog(null, "Please enter another side length of a triangle:");
        sideB = Integer.parseInt(sideLength);
        sideLength = JOptionPane.showInputDialog(null, "Please enter the final side length of a triangle:");
        sideC = Integer.parseInt(sideLength);
        
        //Determination of area using Heron's formula
        halfPerimeter = (0.5)*(sideA+sideB+sideC);
        triangleArea = Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
        
        //Branching and nested statements to determine triangle type then print type and area
        if((sideA >= sideB + sideC)||(sideB >= sideA + sideC)||(sideC >= sideA + sideB))
        {
            JOptionPane.showMessageDialog(null, "This is not a triangle.");
        }
        
        else if((sideA == sideB)&&( sideB == sideC))
        {
            JOptionPane.showMessageDialog(null, "This is an equilateral triangle with an area of " + triangleArea);
        }
        
        else if((sideA*sideA + sideB*sideB == sideC*sideC )||(sideB*sideB + sideC*sideC == sideA*sideA)||(sideC*sideC + sideA*sideA == sideB*sideB))
        {
            if((sideA == sideB)||(sideB == sideC)||(sideC == sideA))
            {
                JOptionPane.showMessageDialog(null, "This is a right isosceles triangle with an area of " + triangleArea);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This is a right triangle with an area of " + triangleArea);
            }
        }
        
        else if((sideA*sideA + sideB*sideB < sideC*sideC)||(sideB*sideB + sideC*sideC < sideA*sideA)||(sideC*sideC + sideA*sideA < sideB*sideB))
        {
            if((sideA == sideB)||(sideB == sideC)||(sideC == sideA))
            {
                JOptionPane.showMessageDialog(null, "This is an obtuse isosceles triangle with an area of " + triangleArea);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This is an obtuse triangle with an area of " + triangleArea);
            }
        }
        
        else
        {
          if((sideA == sideB)||(sideB == sideC)||(sideC == sideA))
            {
                JOptionPane.showMessageDialog(null, "This is an acute isosceles triangle with an area of " + triangleArea);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This is an acute triangle with an area of " + triangleArea);
            }  
        }
    }
    
}
