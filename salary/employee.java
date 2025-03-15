import java.util.Scanner;
 public class employee {
     Scanner scan = new Scanner(System.in);
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Select an occupation: \n1:manager\n2:designer\n3:employee\n4:others");
         int occupation = scan.nextInt();
         double result;
         System.out.println("Enter the basic salary");
         double basic = scan.nextDouble(); 
         
         if (occupation == 1) {
             result = basic + (0.2 * basic); 
             System.out.println("Salary: " + result);
         } else if (occupation == 2) {
             result = basic + (0.1 * basic);
             System.out.println("Salary: " + result);
         } else if (occupation == 3) {
             result = basic;
             System.out.println("Salary: " + result);
         } else if (occupation == 4) {
             result = basic - (0.05 * basic);
             System.out.println("Salary: " + result);
         } else {
             System.out.println("Invalid input");       
         }   
    }
 }
 