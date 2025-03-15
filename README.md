# javaProgram
1) Which command is used to check the current status of files in a Git repository?  
*
git verify
git status
git log
git check
2) What is the purpose of git push?  
*
Delete a repository
Add files to staging
Pull the latest changes from a remote repository
Upload local commits to a remote repository
3) What is GitHub primarily used for?
*
Designing web pages
Hosting and managing Git repositories online
Running Java applications
Sending emails
4) What is the difference between git commit and git push?  
*
Both commands do the same thing
git commit pushes changes to GitHub, git push saves them locally
git commit deletes files, git push restores them
git commit saves changes locally, git push sends them to a remote repository
5) How do you configure a Git user globally?  
*
git config --global user.name "Your Name"
git setup user
git set-user
git user-config
6) What does the git commit -m "message" command do?  
*
Saves the changes permanently to the remote repository
Stages files for commit
Creates a new commit with a message describing the changes
Pushes changes to the remote repository
7) Which command is used to add files to the staging area?  
*
git stage
git add
git commit
git push
 8) What is the purpose of the git clone command?  
*
To copy an existing repository from a remote server
To delete a Git repository
To stage files before committing
To create a new Git repository
9) Which of the following is a valid declaration of a variable in Java?
*
float rate = 7.5;
boolean flag = "true";
char ch = 'AB';
int 1num = 10;
10) What will be the output of the following code?
int x = 10;
while (x > 0) {
    if (x == 5) {
        break;
    }
    x--;
}
System.out.println(x);
*
5
0
10
1
 11) What will be the output of the following for loop?  
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.print(i + " ");
}
*
O 1 2 3 4
0 1 2 3
1 2 3
0 1 2
 12) Which of the following is NOT a valid Java data type?  
*
float
real
double
byte
13) A toll system charges different amounts based on the type of vehicle and offers discounts for frequent travelers.

Requirements: If the vehicle type is "Car," the toll fee is ₹100. If the vehicle type is "Truck," the toll fee is ₹200. If the vehicle has an RFID pass, apply a 10% discount. Implement a method to calculate the toll fee. Use a loop to process multiple vehicles.
*
import java.util.Scanner;

public class Toll {

    public static int calculate(String vehicleType, boolean hasRFIDPass) {
        int tollFee;
        if (vehicleType.equalsIgnoreCase("Car")) {
            tollFee = 100;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            tollFee = 200;
        } else {
            System.out.println("Invalid vehicle type.");
            return -1;
        }
        if (hasRFIDPass) {
            tollFee *= 0.9;
        }
        return tollFee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 'Cancel' to stop processing vehicles.");
            System.out.print("Enter vehicle type (Car or Truck): ");
            String vehicleType = scanner.nextLine();
            if (vehicleType.equalsIgnoreCase("Cancel")) {
                break;
            }
            System.out.print("Does the vehicle have an RFID pass(y or n): ");
            String rfid = scanner.nextLine();
            boolean hasRFIDPass = rfid.equalsIgnoreCase("y");
            double tollFee = calculate(vehicleType, hasRFIDPass);
            if (tollFee != -1) {
                System.out.printf("The toll fee for the %s is %.2f%n%n ", vehicleType, tollFee);
            }
        }

        scanner.close();
    }
}
 14) A bank provides different types of accounts: Savings Account and Current Account.  
Create a base class BankAccount with attributes accountNumber, balance, and methods like deposit() and withdraw(). Create SavingsAccount and CurrentAccount as subclasses: SavingsAccount: Allows a withdrawal only if the balance remains above ₹500. CurrentAccount: Allows unlimited withdrawals but charges ₹50 if balance falls below ₹1000. Use methods to handle deposits and withdrawals.
*
 15) A company needs to calculate employee salaries based on their job roles.
Create a base class Employee with attributes name, baseSalary, and a method calculateSalary(). Create two subclasses: Manager: Gets a 20% bonus. Developer: Gets a 10% bonus. Use a loop to calculate salaries for multiple employees. Print the final salary using if conditions.    
*
import java.util.Scanner;
 public class employee {
     Scanner scan = new Scanner(System.in);
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
 
         System.out.println("Enter the basic salary");
         double basic = scan.nextDouble(); 
         System.out.println("Select an occupation: \n1:manager\n2:designer\n3:employee\n4:others");
         int occupation = scan.nextInt();
         double result;
         
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
 
16) An e-commerce store calculates the total price of items in a shopping cart.  
Create a method calculateTotalPrice(int[] prices, boolean isPremiumMember). Use a loop to iterate through the prices of items in the cart. If the user is a premium member, apply a 5% discount. If the total price exceeds ₹5000, apply an extra 10% discount.
*
 17) A school needs an automated grading system. 
Create a method calculateGrade(int marks). If marks >= 90, grade = "A". If marks >= 75, grade = "B". If marks >= 50, grade = "C". Otherwise, grade = "F". Use a loop to process marks for multiple students.
*
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
18) What is method overriding in Java?  
*
Defining multiple methods with the same name but different parameters in the same class
Defining a method in a subclass with the same name and parameters as a method in the superclass
Defining a private method inside a class
Using a method without defining it in a class
19) What will be the output of the following code?
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's show()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
*
Child's show()
20) What will be the output of the following code?
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's show()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
*
Child's show()




16
import java.util.Scanner;
public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in the cart: ");
        int numberOfItems = scanner.nextInt();
        int[] prices = new int[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": Rs ");
            prices[i] = scanner.nextInt();
        }
        System.out.print("Are you a premium member? (yes/no): ");
        String membershipStatus = scanner.next().trim().toLowerCase();
        boolean isPremiumMember = membershipStatus.equals("yes");
        double totalPrice = calculateTotalPrice(prices, isPremiumMember);
        System.out.printf("The total price of items in the cart is: Rs %.2f%n", totalPrice);
        scanner.close();
    }
    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        if (isPremiumMember) {
            totalPrice *= 0.95; 
        }
        if (totalPrice > 5000) {
            totalPrice *= 0.90;
        }
        return totalPrice;
    }
}