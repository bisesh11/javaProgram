package stringBuilder;
public class StringConcat {
    
    public void concat(String x, String y) { // Corrected method name
        System.out.println(x + " " + y); // Added space between words
    }

    public static void main(String[] args) {
        StringConcat obj = new StringConcat();
        obj.concat("Niraj", "Kumar"); // Method name corrected
    }
}
