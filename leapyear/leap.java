package leapyear;

public class leap {
    public static void main(String args[]){
        int i=2020;
        if((i % 4==0 && i % 100 !=0) || (i % 400 == 0)){
            System.out.println(i+"leap year");
        }
        else{
            System.out.println("not");
        }
    }
}
    
    

