import java.util.Scanner;
 public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scan.nextLine();
        System.out.println("subject");
        String subject = scan.nextLine();
        System.out.println("Enter the marks");
        int marks = scan.nextInt();
        String grade = calculateGrade(marks);
        System.out.println("Grade: " + grade);
    }   
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
        return "A";
        } 
        else if (marks >= 75) {
            return "B";
        }
        else if (marks >= 50) {
            return "C";
        } 
        else{
            return "F";
        }
    }
}