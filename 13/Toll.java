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