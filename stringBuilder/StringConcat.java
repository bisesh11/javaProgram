package stringBuilder;
public class StringConcat {
    
    public void concat(String x, String y) { 
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        StringConcat obj = new StringConcat();
        obj.concat("Niraj", "Kumar");
    }
}