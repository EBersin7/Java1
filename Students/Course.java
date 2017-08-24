package course;

import java.util.Scanner;

public class Course {

    public static void main(String[] args) {
        System.out.println("This program will calculate and print the average gpa, the highest gpa,"
                + "and the total number of students in this course.");
        do 
        {
            String response = "";
            double GPA;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("To add a new student, please enter their name."
                    + "\nOtherwise, enter a blank to finish entering information.");
            response = keyboard.nextLine();
            if (!(response.isEmpty()))
            {
                System.out.println("Now, please enter this student's GPA.");
                GPA = keyboard.nextDouble();
                Student s1 = new Student(response, GPA);
            }
            else{
                break;
            }
        }while(true);

        Student.printReport();

    }

}
