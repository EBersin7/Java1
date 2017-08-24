package course;

public class Student {

    private String name;
    private double gpa;

    private static int numberOfStudents = 0;
    private static double averageGpa = 0;
    private static String highestGpaName = "No name yet.";
    private static double highestGpa = Integer.MIN_VALUE;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;

        ++numberOfStudents;

        if (this.gpa > highestGpa) {
            highestGpa = this.gpa;
            highestGpaName = this.name;
        }

        averageGpa = ((averageGpa * (numberOfStudents - 1) + this.gpa)) / numberOfStudents;

    }

    public static void printReport() {
        System.out.println("The total number of students in this course is: " + numberOfStudents
                + " \nThe average GPA in this course is: " + averageGpa + " \nThe student with the highest GPA is: "
                + highestGpaName + " \nThis student has a GPA of: " + highestGpa);
    }

}
