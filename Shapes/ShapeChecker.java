/*
 * Edward Bersin : tuf18309@temple.edu
 * This program creates three objects of the Shape class, sets values to them, 
 * calculates their areas, and then checks whether or not they're equal.
 * Last modified March 23rd, 2015
 */

package shapechecker;

public class ShapeChecker {

    public static void main(String[] args) 
    {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape();
        Shape shape3 = new Shape();
        
        shape1.setType(ShapeType.RECTANGLE);
        System.out.println(shape1.getType());
        shape1.setBase(50);
        shape1.setHeight(20);
        
        shape2.setType(ShapeType.TRIANGLE);
        shape2.setBase(80);
        shape2.setHeight(24);
        
        shape3.setType(ShapeType.CIRCLE);
        shape3.setDiameter(36);
        
        if(shape1.equals(shape2))
        {
            System.out.println("Shape 1 is equal to shape 2");
        }
        else
        {
            System.out.println("These shapes are not equal");
        }
        
        if(shape2.equals(shape3))
        {
            System.out.println("Shape 2 is equal to shape 3");
        }
        else
        {
            System.out.println("These shapes are not equal");
        }
        
        if(shape1.equals(shape3))
        {
            System.out.println("Shape 1 is equal to shape 3");
        }
        else
        {
            System.out.println("These shapes are not equal");
        }
    }
    
}
